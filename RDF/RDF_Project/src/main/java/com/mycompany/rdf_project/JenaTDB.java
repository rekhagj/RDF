/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rdf_project;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ReadWrite;
import org.apache.jena.query.ResultSet;
import org.apache.jena.tdb.TDBFactory;
import org.apache.jena.tdb.base.file.Location;

public class JenaTDB {
private Dataset dataset;
    public static void main(String[] args) {
       new JenaTDB().queryMethod("4");
     //  new JenaTDB().mainMethod("4");
   }
  
   
    private void end(){
     dataset.commit();
      dataset.close();
    }

    private void init(){
       
        
        Location location = Location.create("//home/rekha/Project/tdb1");
        
         dataset = TDBFactory.createDataset(location);
         dataset.begin(ReadWrite.READ);
    }

    public QueryDataResult queryMethod(String queryNumber){
          init();
          System.out.println("=========================== Jena Stared ================================");
        Instant startTime = QueryConstents.getCurrentTime();
         String queryValue = QueryConstents.queryMap.get(queryNumber);
        QueryDataResult queryDataResult = new QueryDataResult();
        List<Result>   qresult = new ArrayList();
        List<String>  tiltes = new ArrayList();
        int count = 0;
        
        Query query = QueryFactory.create(queryValue);
        QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
        
        
        ResultSet results = qexec.execSelect();
        while (results.hasNext()) {
            QuerySolution soln = results.nextSolution();
                                                 
            Result output = new Result();
                if (count ==  0 ){
                  for( int i=0; i<soln.toString().length(); i++ ) {
                         if( soln.toString().charAt(i) == '(' ) {
                            count++;
                        }
                   }
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
                      output.setX(soln.get("X").toString());
                      
                   }
                   if(count >  1){
                       output.setY(soln.get("Y").toString());
                   }
                   if(count >  2){
                       output.setZ(soln.get("Z").toString());
                   }
                   if(count >  3){
                       output.setZ(soln.get("X1").toString());
                   }
          //     System.out.println(output.getX());
                    qresult.add(output);

        }
        Instant endTime = QueryConstents.getCurrentTime();
        queryDataResult.setDurationofCall(QueryConstents.durationofCall(startTime, endTime));
        
        queryDataResult.setContents(qresult);
        queryDataResult.setTites(tiltes);
        qexec.close();
        this.end();
        System.out.println("=========================== Jena Ended ================================");
        return queryDataResult;
    }
    
   


}
