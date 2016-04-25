/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rdf_project;

import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import org.openrdf.query.BindingSet;
import org.openrdf.query.QueryLanguage;
import org.openrdf.query.TupleQuery;
import org.openrdf.query.TupleQueryResult;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import org.openrdf.repository.sail.SailRepository;
import org.openrdf.sail.nativerdf.NativeStore;

/**
 *
 * @author rekha
 */
public class Sesame {
    private  RepositoryConnection conn ;
    private Repository repo ;
    private final String  tripleIndexes = "spoc,posc,cosp";
    public static void main(String[] args) {
        new Sesame().queryMethod("1");
        
    }

   
    private void end(){
          repo.shutDown();
          conn.close();
    }

    private void init(){
        File dataDir = new File("//home/rekha/.aduna/openrdf-sesame-console/repositories/1405/");
        repo = new SailRepository(new NativeStore(dataDir, tripleIndexes));
        repo.initialize();
        conn = repo.getConnection();
    }

    public QueryDataResult queryMethod(String queryNumber){
          init();
          System.out.println("=========================== Sesame Stared ================================");
           Instant startTime = QueryConstents.getCurrentTime();
        String queryValue = QueryConstents.queryMap.get(queryNumber);
        QueryDataResult queryDataResult = new QueryDataResult();
        List<Result>   qresult = new ArrayList();
        List<String>  tiltes = new ArrayList();
        int count = 0;
        TupleQuery tq = conn.prepareTupleQuery(QueryLanguage.SPARQL, queryValue);
        TupleQueryResult result = tq.evaluate();
        
        
            while (result.hasNext()) {
                BindingSet bindings = result.next();
                Result output = new Result();
                if (count ==  0 ){
                   count =  bindings.size();
                   if(count >  0){
                       tiltes.add("X");
                   }
                   if(count >  1){
                       tiltes.add("Y");
                   }
                   if(count >  2){
                       tiltes.add("Z");
                   }
                   if(count >  3){
                       tiltes.add("X1");
                   }
                }
                    if(count >  0){
                      output.setX(bindings.getValue("X").stringValue());
                   }
                   if(count >  1){
                       output.setY(bindings.getValue("Y").stringValue());
                   }
                   if(count >  2){
                        output.setZ(bindings.getValue("Z").stringValue());
                   }
                   if(count >  3){
                       output.setXx(bindings.getValue("X1").stringValue());
                   }
                
                    qresult.add(output);
                  //  System.out.println(bindings);
            }
        Instant endTime = QueryConstents.getCurrentTime();
        queryDataResult.setDurationofCall(QueryConstents.durationofCall(startTime, endTime));
        queryDataResult.setContents(qresult);
        queryDataResult.setTites(tiltes);
        System.out.println("=========================== Sesame Ended ================================");
         end();
        return queryDataResult ;
    }

}
