/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rdf_project;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rekha
 */
public final class QueryConstents {

    static final String QUERY1 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X ?Y WHERE {?Y1 rdf:type ub:University. ?Z1 rdf:type ub:Department. ?Z1 ub:subOrganizationOf ?Y1.  ?Y1 ub:name ?X. ?Z1 ub:name ?Y.  }";
    static final String QUERY2 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X ?Y where {?s ub:name ?X; ub:teacherOf ?Y.  filter (?X =  \"FullProfessor6\" ) ?Y ub:name ?X1.} order by (?Y)";
    static final String QUERY3 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X WHERE  {?X1 rdf:type ub:GraduateStudent .  ?X1 ub:takesCourse  <http://www.Department0.University0.edu/GraduateCourse0>.  ?X1 ub:name ?X.}";
    static final String QUERY4 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X ?Y  ?Z  WHERE {?Y1 rdf:type ub:University .  ?Z1 rdf:type ub:Department .  \n"
            + "?X1 rdf:type ub:AssistantProfessor.   ?Z1 ub:subOrganizationOf ?Y1 .  ?X1 ub:mastersDegreeFrom ?Y1. ?X1 ub:name ?X. ?Y1 ub:name ?Y. ?Z1 ub:name ?Z.}";
    static final String QUERY5 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X WHERE {?X1 rdf:type ub:Publication . ?X1 ub:publicationAuthor <http://www.Department0.University0.edu/AssistantProfessor0>. ?X1 ub:name ?X. }";
    static final String QUERY6 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X ?Y ?Z WHERE {?XY rdf:type ub:AssociateProfessor . ?XY ub:worksFor <http://www.Department0.University0.edu> . ?XY ub:name ?X . ?XY ub:emailAddress ?Y .  ?XY ub:telephone ?Z. }";
    static final String QUERY7 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X WHERE {?X1 rdf:type ub:UndergraduateStudent . ?X1 ub:memberOf <http://www.Department0.University0.edu>. ?X1 ub:name ?X.}";
    static final String QUERY8 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X  WHERE {?X1 rdf:type ub:UndergraduateStudent. ?X1 ub:name ?X. }";
    static final String QUERY9 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X ?Y WHERE {?X1 rdf:type ub:UndergraduateStudent . ?Y1 rdf:type ub:Course .  ?X1 ub:takesCourse ?Y1 . <http://www.Department0.University0.edu/AssociateProfessor0> ub:teacherOf ?Y1. ?X1 ub:name ?X. ?Y1 ub:name ?Y} ";
    static final String QUERY10 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X ?Y ?Z  WHERE {?X1 rdf:type ub:UndergraduateStudent . ?Y1 rdf:type ub:Department . ?X1 ub:memberOf ?Y1 . ?Y1 ub:subOrganizationOf <http://www.University0.edu> . ?X1 ub:emailAddress ?Z.   ?X1 ub:name ?X. ?Y1 ub:name ?Y}";
    static final String QUERY11 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X ?Y ?Z WHERE {?X1 rdf:type ub:UndergraduateStudent .   ?Y1 rdf:type ub:AssociateProfessor .  ?Z1 rdf:type ub:Course . ?X1 ub:advisor ?Y1 .  ?Y1 ub:teacherOf ?Z1 .  ?X1 ub:takesCourse ?Z1. ?X1 ub:name ?X. ?Y1 ub:name ?Y. ?Z1 ub:name ?Z }";
    static final String QUERY12 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X WHERE {?X rdf:type ub:ResearchGroup .   ?X ub:subOrganizationOf <http://www.Department0.University0.edu>}";
    static final String QUERY13 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X WHERE {?X rdf:type ub:Lecturer } order by (?X) ";
    static final String QUERY14 = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> PREFIX ub: <http://swat.cse.lehigh.edu/onto/univ-bench.owl#> SELECT ?X ?Y WHERE {  ?Y1 rdf:type ub:Department .  ?X1 ub:worksFor ?Y1 .  ?Y1 ub:subOrganizationOf <http://www.University0.edu>. ?X1 ub:name ?X. ?Y1 ub:name ?Y }";

    static Map<String,String> queryMap;

    static {
        queryMap = new HashMap();
        queryMap.put("1", QUERY1);
        queryMap.put("2", QUERY2);
        queryMap.put("3", QUERY3);
        queryMap.put("4", QUERY4);
        queryMap.put("5", QUERY5);
        queryMap.put("6", QUERY6);
        queryMap.put("7", QUERY7);
        queryMap.put("8", QUERY8);
        queryMap.put("9", QUERY9);
        queryMap.put("10", QUERY10);
        queryMap.put("11", QUERY11);
        queryMap.put("12", QUERY12);
        queryMap.put("13", QUERY13);
        queryMap.put("14", QUERY14);
    }
    
    public static Instant getCurrentTime(){
        return Instant.now();
    }
    public static long durationofCall(Instant start, Instant end){
       // return Duration.between(start, end).toMinutes();
        return Duration.between(start, end).toMillis();
       // return Duration.between(start, end).toNanos();
    }
}


