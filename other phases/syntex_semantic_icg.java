/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author Asad_Zaidi
 */
public class While {
    
  

    public static ArrayList<String> VP = new ArrayList<String>();
         public static ArrayList<String> CP = new ArrayList<String>();
         public static ArrayList<String> line = new ArrayList<String>();
         public static int i=0;
         
         //stack
        public static Stack st= new Stack();
         public static int scope=0;
         //stack
         
         
         //function definition
        public static Map<Integer,String[]> lookupfunction=new HashMap<>();        
        public static int fid=0; //unique id for function map
        public static String  am="";//am=VP
        public static String tm="-";//TM=VP (by default -)
        public static String pl=""; //PL(TYPE)
        public static String pl_arg="";// argumeents
        public static String namefun="";//Name=ID.VP
        public static String scope2="";//scope filhal hardcode
        public static String result="";//result for yes/no
       
        //function prorotype
   public static Map<Integer,String[]> lookupfuncdecl=new HashMap<>();        
        public static int fdid=0; //unique id for function map
        public static String  fam="";//am=VP
        public static String ftm="-";//TM=VP (by default -)
        public static String fpl=""; //PL(TYPE)
        public static String fpl_arg="";// argumeents
        public static String fnamefun="";//Name=ID.VP
        public static String fscope2="";//scope filhal hardcode
        public static String fresult="";//result for yes/
        
        //decl
        
         public static Map<Integer,String[]> lookupdecl=new HashMap<>();  
        public static int did=0;
        public static String dam="-";
        public static String dname="";
        public static String dtype="";
         public static String dtype2="";
        public static String dsize="-";
        public static int count=-1; //
        public static String size_c=""; //getting size to match array size with values
        public static String size_c2=""; //inserting count to match
        public static String dscope="";
        public static String result2="";
        public static String typec1="";
        public static String typec2="";
        
        
  
        //structure
        public static Map<Integer,String[]> lookupstrc=new HashMap<>(); 
        public static int sid=0;
        public static String sname="";
        public static String stype="";
        public static String sscope="";
          public static String result4="";

          //structure link for variables define inside
          public static Map<Integer,String[]> lookupstrclink=new HashMap<>(); 
        public static int slinkid=0;
        public static String slname="";
        public static String sltype="";
        public static String slscope="";
        public static String slsize="-";
        public static String sltype2="";
        public static String result5="";
        
        //structure link2 for instances
        public static Map<Integer,String[]> lookupstrclink2=new HashMap<>(); 
        public static int slink2id=0;
        public static String sl2Stname="";
        public static String sl2name="";
        public static String sl2scope="";
        public static String result6="";
        public static String result7="no";
        
        
        //expression
        public static String t1="";
        public static String t2="";
        public static String t3="";
        public static String t4="";
           public static String t5="";
        public static String res1="";
        public static String res2="";
             public static String res3="";
               public static String resinc="";
                 public static String ftinc="";
                 public static String flag5="";
          
             
          
             //func_call
             public static String resultcall="";
             public static String typecall="";
             public static String func_call_arg="";
             public static String flag1="no";
             public static String fcid="";
             public static String fctype="";
             public static String fcresult="";
                public static String fp="";
              public static String fctype2=""; ///return type
            public static ArrayList<String> a1 = new ArrayList<>();
            public static ArrayList<String> a2 = new ArrayList<>();
            
               //for assign
        public static String si="";
        public static String s="";
        public static String styp="";
        public static String typec4="";
          public static String typec5="";
          public static String strname="";// if a1 available return structre to it
        public static String styp1="";
          public static String result11="";
          public static String result12="";
           public static String result13="";
            public static String result14="";
          public static String c1="";
            public static String dnamee="";
             public static String dtypee2="";
              public static String flag4="";
             public static String flag3="";
   
             
             //generating label and temp
   public static int countlabel=0;
    public static int countTemp=0;
    public static int countTemp2=0;
       public static int countlabel2=0;
       public static int countlabel3=0;
    public static String icg1="";
    public static String icg2="";
    public static String icg3="";
    public static int icgcount=0;
    public static int icgcount2=0;
    public static int icgcount3=0;
    public static String flagicg="";
    public static String icg4="";
    public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
             public static ArrayList<String> a3 = new ArrayList<>();
              public static ArrayList<String> a4 = new ArrayList<>();
        
    public static void main(String[] args) throws FileNotFoundException {
 FileOutputStream out = new FileOutputStream("E:\\D Drive\\ASAD__UNIVERSITY2\\Compiler\\FloatingPoint\\icg.txt");
        String  theString;
           String lines;
         

        Scanner scanner = new Scanner(new File("input.txt"));
        while (scanner.hasNextLine()) {
            
            
            lines=scanner.nextLine();
        StringTokenizer st= new StringTokenizer(lines,",");
        
             while (st.hasMoreElements()) {  
                 
             VP.add(st.nextToken());
             CP.add(st.nextToken());
             line.add(st.nextToken());
         
     }
           
       
}   
       if(Prog_struc()==true ){
        System.out.println("Parsed");
        }else{
            System.out.println("Not Parsed");
        
        }

    }

  
     
    public  static String Glabel(){
                    countlabel++;
        return "L"+countlabel+":";
    }
    public  static String Glabel3(){
        countlabel3=countlabel;
        countlabel3+=10;
        return "L"+countlabel3+":";
    }
    
     public  static String Gtemp(){
        countTemp++;
        return "t"+countTemp;
        
    }
     public static String Glabel2(){
        countlabel2=countlabel;
        countlabel2++;
        return "L"+countlabel2+":";
     }
     public  static String Gtemp2(){
        countTemp2=countTemp;
        countTemp2--;
        return "t"+countTemp;
    }
    
    public static boolean Prog_struc(){
            if(CP.get(i).equals("AM")||CP.get(i).equals("DT")||CP.get(i).equals("strc")||CP.get(i).equals("#")||CP.get(i).equals("start")){
            if(CP.get(i).equals("AM")||CP.get(i).equals("DT")||CP.get(i).equals("strc")||CP.get(i).equals("#")||CP.get(i).equals("start")){
                if(d()){
                    
//                    System.out.println("asadzaidi"+CP.get(i));
                    
                    if(str()){
//                        System.out.println("Yoyo"+CP.get(i));
                        if(f2decl()){
//                        System.out.println("Yoyo"+CP.get(i));
                    
                        if(ma1()){
//                            System.out.println("Yoyo"+CP.get(i));
                            if(f3()){
                            
//                            i++;
                            if(CP.get(i).equals("$")){
                                            
                                System.out.println("Program_structure Parsed");
                            return true;
                            }
                                    
                            }
                        
                        
                        }
                    
                    }
                    
                }
            }
            }
            }
            
            
System.out.println("Error at line number"+line.get(i)+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean d(){
      if(CP.get(i).equals("AM")||CP.get(i).equals("DT")||CP.get(i).equals("strc")||CP.get(i).equals("#")||CP.get(i).equals("start")){
      if(CP.get(i).equals("AM")||CP.get(i).equals("DT")){
          if(decl()){
              i++;
              if(d()){
                  
                  return true;
              }
          
          }
      
      
      }
      else if(CP.get(i).equals("strc")||CP.get(i).equals("start")||CP.get(i).equals("#")){
      
      return true;
      }
      else if(CP.get(i).equals("$")){
      
      return true;
      }
      else if(CP.get(i).equals(";")){
      
      return true;
      }
      
      }
//      System.out.println("Error at line number"+line+"CP is "+CP.get(i)+" VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean str(){
              if(CP.get(i).equals("strc")||CP.get(i).equals("start")||CP.get(i).equals("#")){
              if(CP.get(i).equals("strc")){
                  
                  if(str_def()){
                      i++;
//                      System.out.println("r"+CP.get(i));
                              
                       if(str()){
                      
                      return true;
                      }
                      
                  }
                  
              }
              else if(CP.get(i).equals("start")||CP.get(i).equals("#")){
                  
                  return true;
              }
//              else if(CP.get(i).equals(";")){
//                  
//                  return true;
//              }
              
              }
//              System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean f2decl(){
         if(CP.get(i).equals("#")||CP.get(i).equals("start")){
            if(CP.get(i).equals("#"))
            {
                    if(func_decl()){
                        
                        i++;
                        if(f2decl()){
                        
                            return true;
                        }
                    
                    }
            
           }
            else if(CP.get(i).equals("start")){
                return true;
            }
         
         
         }
        
        
        return false;
    }
    
    public static boolean ma1(){
        
        if(CP.get(i).equals("start")||CP.get(i).equals(";")){
             if(CP.get(i).equals("start")){
//                 scope++;
            i++;
            if (body()){
                i++;
                System.out.println("Main Parsed");
                
                return true;
            }
             }
             else if(CP.get(i).equals(";")){
                    
                 return true;
             }
        }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean f3(){
   
   if(CP.get(i).equals("AM")||CP.get(i).equals(";")||CP.get(i).equals("$")){
        if(CP.get(i).equals("AM")){
            
            
            if(func_def()){
                i++;
                if(f3()){
                return true;
                }
                
            }
            
            
        }
        else if(CP.get(i).equals("$")){
            return true;
        }
         else if(CP.get(i).equals(";")){
                return true;
        }
    
    }
    
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    //function prototype
    
    public static boolean func_decl(){
     String[] enteries=new String[7];
        
        if(CP.get(i).equals("#")){
        
        i++;
        if(CP.get(i).equals("AM")){
            if(CP.get(i).equals("AM")){
               
                fam=VP.get(i); //taking VP of AM

                i++;
                if(fTM()){
//                    System.out.println(CP.get(i)+"asadzaidi");
                    
                    if(fRT()){
//                         System.out.println(CP.get(i)+"asadzaidi");
                        if(CP.get(i).equals("ID")){
                               fnamefun=VP.get(i);//taking value of function def

                        i++;
                        
                        if(CP.get(i).equals("(")){
//                             System.out.println(CP.get(i)+"asadzaidi");
                            i++;
                             
                            if(farg3()){
//                                 System.out.println(CP.get(i)+"asadzaidi");
                                    if(CP.get(i).equals(")")){
                                            i++;
        
                                        fpl+=fpl_arg;// adding void-> and argumennts int_char_int[] 
                                                    //becomes void->int,char,int[]
                                                    
                                                    //adding values to array index
                                        enteries[0]=fam; 
                                        enteries[1]=ftm;
                                        enteries[2]=fnamefun;
                                        enteries[3]=fpl;
                                        enteries[4]=fscope2;
                                        enteries[5]=fpl_arg;
                                        enteries[6]=fp;
                                        


                                        for(int d=0;d<fdid;d++){
                                        if((lookupfuncdecl.get(d)[2].equals(enteries[2]))&&(lookupfuncdecl.get(d)[5].equals(enteries[5]))){
                                            System.out.println("function prototype redeclearation error");
                                            fresult="yes";
                                            break;
                                            }
                                            }

        
                                          if(!"yes".equals(fresult)){
                                          lookupfuncdecl.put(fdid,enteries);
                                          fdid++;
                                          
                                            System.out.println("Inserted function prototype");
                                               }
                                          
                                          
                                                 for(int c=0;c<fdid;c++){
                                                System.out.println("table"+Arrays.toString(lookupfuncdecl.get(c)));
                                                    }
//                                        
//                                      after inserting values make all values to default
                                                fam=""; 
                                                ftm="-";
                                                 fpl="";
                                                 fpl_arg="";
                                                 fnamefun="";
                                                 fresult="";
                                                 fscope2="";   
                                  
//                                                 System.out.println(CP.get(i)+"asadzaidi"); 
                                                 if(CP.get(i).equals(";")){ 
                                       
                                           
                                                    System.out.println("Function prototype parsed"+CP.get(i));
                                                    return true;
                                                    }
                                     
                                        }
                                    
                                    }
                            }
                        
                        }
                    }
                
                }
            }    
            }
        
        }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    
    return false;
            }
    
    public static boolean fTM(){
        
        if(CP.get(i).equals("TM")||CP.get(i).equals("void")||CP.get(i).equals("DT")){
        
            if(CP.get(i).equals("TM")){
            
                     if(CP.get(i).equals("TM")){
                         
                         ftm=VP.get(i); //if there is no null value of TM then TM value will be replaced by -
//                         System.out.println(tm+"->");
                         
                         i++;
                         return true;

                     }
            
            
            }
            else  if(CP.get(i).equals("void")){
                return true;
            
            
            }
            else  if(CP.get(i).equals("DT")){
                return true;
            
            
            }
        
        }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
        
    return false;
    }
    public static boolean fRT(){
    
         if(CP.get(i).equals("void")||CP.get(i).equals("DT")){
             
             fpl=VP.get(i)+"->"; //void->/DT->
             fp=VP.get(i);
//             System.out.println(fpl);
                i++;
                return true;
            }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    public static boolean farg3(){
        
        if(CP.get(i).equals("DT")||CP.get(i).equals("strc")||CP.get(i).equals(")")){
            
            if(CP.get(i).equals("DT")){
                
                if(CP.get(i).equals("DT")){
                    
                    fpl_arg+=VP.get(i);//void->int

                    i++;
                     
                if(CP.get(i).equals("ID")){
//                    System.out.println("hello"+CP.get(i));
                    i++;
                            
                   
//                    System.out.println("set"+CP.get(i));
                    if(fG5()){
//                        System.out.println("set2"+CP.get(i));
                        if(fC()){
//                            System.out.println("uuu"+CP.get(i));
                            
                            return true;
                        
                        }
                    
//                    
                
                }
                }
            
            
            
            }
            }
            else if(CP.get(i).equals("strc")){

            
                    if(CP.get(i).equals("strc")){
                           fpl_arg+=VP.get(i); //void->strc
                           System.out.println(fpl_arg);
                            i++;
                        
                        if(CP.get(i).equals("ID")){

                        i++;
                        if(fC()){
                           
//                            i++; 
                            
                            return true;
                        
                        }
                        
                        }
                    
                    }
                    
            
            
            }
            else if(CP.get(i).equals(")")){
                return true;
            
            }
        
        }
        
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean fG5(){
    
            if(CP.get(i).equals("[")||(CP.get(i).equals("_"))||(CP.get(i).equals(")"))){
            if(CP.get(i).equals("[")){

                if(farr5()){
                  
                    return true;
                
                }
            
            }
            else if(CP.get(i).equals("_")||(CP.get(i).equals(")"))){
              
            return true;
            }
            
            
            }
//            System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean fC(){
        if(CP.get( i).equals("_")||(CP.get(i).equals(")"))){
        
        if(CP.get(i).equals("_")){
            if(CP.get(i).equals("_")){
                  fpl_arg+=VP.get(i); //void->int_....

                i++;
//                System.out.println(CP.get(i));
                if(farg3()){
                    
                    return true;
                
                }
            
            }
        
        
        }
        else if(CP.get(i).equals(")")){
            
            return true;
         
         }
        
        
        }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    public static boolean farr5(){
    
         if(CP.get(i).equals("[")||(CP.get(i).equals("_"))){
             
          if(CP.get(i).equals("[")){
              fpl_arg+=VP.get(i);//void->int[
          i++;
           if(CP.get(i).equals("]")){
               fpl_arg+=VP.get(i);//void->int[]

               i++;
               return true;
           }
          
          }
         
         }
         else  if(CP.get(i).equals("_")){
         
             return true;
         }
//         System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }

    //function definition
        
     
    public static boolean func_def(){
        result="";
     String[] enteries=new String[6]; //array (enteries it must be local to function)

        
        if(CP.get(i).equals("AM")){
            if(CP.get(i).equals("AM")){
               
                am=VP.get(i); //taking VP of AM

                i++;
                if(TM()){

                    if(RT()){

                        if(CP.get(i).equals("ID")){
                               namefun=VP.get(i);//taking value of function def

                        i++;
                        
                        if(CP.get(i).equals("(")){
                            i++;
                             
                            if(arg3()){
    
                                    if(CP.get(i).equals(")")){
                                            i++;
        
                                        pl+=pl_arg;// adding void-> and argumennts int_char_int[] 
                                                    //becomes void->int,char,int[]
                                                    
                                                    //adding values to array index
                                        enteries[0]=am; 
                                        enteries[1]=tm;
                                        enteries[2]=namefun;
                                        enteries[3]=pl;
                                        enteries[4]=scope2+scope;
                                        enteries[5]=pl_arg;
                                        


                                        for(int d=0;d<fdid;d++){
                                        if((lookupfuncdecl.get(d)[2].equals(enteries[2]))&&(lookupfuncdecl.get(d)[5].equals(enteries[5]))){
//                                            System.out.println("function redeclearation error");
                                            result="yes";
                                            break;
                                            }
                                        
                                        }
                                        if("".equals(result)){
                                          System.out.println("'"+namefun+"'"+"function Prototype is not defined");  
                                        
                                        }

        
//                                      after inserting values make all values to default
                                                am=""; 
                                                tm="-";
                                                 pl="";
                                                 pl_arg="";
                                                 namefun="";
                                                 
                                                 scope2="";   
                                                
                                    
        
                                                    
                                        if(CP.get(i).equals("{")&&"yes".equals(result)){ 
                                            st.push(scope++);
                                           
                                            if(body()){
                                                if(CP.get(i).equals("}"))
                                                {
                                                    scope=(int) st.pop();
                                                    System.out.println("Function definition parsed"+CP.get(i));
                                                    return true;
                                                    }
                                            
                                            
                                            }
                                        
                                        }
                                        }
                                    
                                    }
                            }
                        
                        }
                    }
                
                }
            
            }
        
        }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    
    return false;
            }
    
    public static boolean TM(){
        
        if(CP.get(i).equals("TM")||CP.get(i).equals("void")||CP.get(i).equals("DT")){
        
            if(CP.get(i).equals("TM")){
            
                     if(CP.get(i).equals("TM")){
                         
                         tm=VP.get(i); //if there is no null value of TM then TM value will be replaced by -
//                         System.out.println(tm+"->");
                         
                         i++;
                         return true;

                     }
            
            
            }
            else  if(CP.get(i).equals("void")){
                return true;
            
            
            }
            else  if(CP.get(i).equals("DT")){
                return true;
            
            
            }
        
        }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
        
    return false;
    }
    public static boolean RT(){
    
         if(CP.get(i).equals("void")||CP.get(i).equals("DT")){
             
             pl=VP.get(i)+"->"; //void->/DT->
//             System.out.println(pl);
                i++;
                return true;
            }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    public static boolean arg3(){
        
        if(CP.get(i).equals("DT")||CP.get(i).equals("strc")||CP.get(i).equals(")")){
            
            if(CP.get(i).equals("DT")){
                
                if(CP.get(i).equals("DT")){
                    
                    pl_arg+=VP.get(i);//void->int

                    i++;
                     
                if(CP.get(i).equals("ID")){
//                    System.out.println("hello"+CP.get(i));
                    i++;
                            
                   
//                    System.out.println("set"+CP.get(i));
                    if(G5()){
//                        System.out.println("set2"+CP.get(i));
                        if(C()){
//                            System.out.println("uuu"+CP.get(i));
                            
                            return true;
                        
                        }
                    
//                    
                
                }
                }
            
            
            
            }
            }
            else if(CP.get(i).equals("strc")){

            
                    if(CP.get(i).equals("strc")){
                           pl_arg+=VP.get(i); //void->strc
                        i++;
                        
                        if(CP.get(i).equals("ID")){

                        i++;
                        if(C()){
                           
//                            i++; 
                            
                            return true;
                        
                        }
                        
                        }
                    
                    }
                    
            
            
            }
            else if(CP.get(i).equals(")")){
                return true;
            
            }
        
        }
        
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean G5(){
    
            if(CP.get(i).equals("[")||(CP.get(i).equals("_"))||(CP.get(i).equals(")"))){
            if(CP.get(i).equals("[")){

                if(arr5()){
                  
                    return true;
                
                }
            
            }
            else if(CP.get(i).equals("_")||(CP.get(i).equals(")"))){
              
            return true;
            }
            
            
            }
//            System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean C(){
        if(CP.get(i).equals("_")||(CP.get(i).equals(")"))){
        
        if(CP.get(i).equals("_")){
            if(CP.get(i).equals("_")){
                  pl_arg+=VP.get(i); //void->int_....
                i++;
                if(arg3()){
                    
                    return true;
                
                }
            
            }
        
        
        }
        else if(CP.get(i).equals(")")){
            
            return true;
         
         }
        
        
        }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    public static boolean arr5(){
    
         if(CP.get(i).equals("[")||(CP.get(i).equals("_"))){
             
          if(CP.get(i).equals("[")){
              pl_arg+=VP.get(i);//void->int[
          i++;
           if(CP.get(i).equals("]")){
               pl_arg+=VP.get(i);//void->int[]
               i++;
               return true;
           }
          
          }
         
         }
         else  if(CP.get(i).equals("_")){
         
             return true;
         }
//         System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
   
    
    
    
    //structure definition
     public static boolean str_def(){
        String enteries3[]=new String[3]; 
         
           if(CP.get(i).equals("strc")){
               if(CP.get(i).equals("strc")){
                   stype=VP.get(i);
                  

                   
                   i++;
                   if(CP.get(i).equals("ID")){
                       sname=VP.get(i);
                       
                       
                                        enteries3[0]=sname; 
                                        enteries3[1]=stype;
                                        enteries3[2]=sscope+scope;
                                        

                                        for(int d=0;d<sid;d++){
                                        if ((lookupstrc.get(d)[0].equals(enteries3[0]))&&(lookupstrc.get(d)[2].equals(enteries3[2]))){
                                            System.out.println("Structure redeclearation error at line number"+line.get(i));
                                            result4="yes";
                                            break;
                                            }
                                            }

        
                                          if(!"yes".equals(result4)){
                                          lookupstrc.put(sid,enteries3);
                                             sid++;
                                           System.out.println("Structure Inserted");
                                           }
                                          
                                          
                                                   
               
                                         for(int c=0;c<sid;c++){
                                                System.out.println("Table Structures->"+Arrays.toString(lookupstrc.get(c)));
                                                    }

                                                 stype="";
//                                                 sname="";
                                                 sscope="";
                                                 result4="";
                      
                       i++;
                       if(CP.get(i).equals("{"))
                       {    
                           st.push(scope++);//stack inc and push
                           
                         
                           i++;

                           if(bodys()){
                               
                               if(CP.get(i).equals("}")){
                                                                          scope=(int) st.pop(); //poping and saving
//                                                                          System.out.println("Scope---------------------------->"+scope);
                               i++;
                               if(CP.get(i).equals(";")){
                                   System.out.println("Structure Parsed");
                                   return true;
                               
                               }
                               
                               }
                           
                           }
                       
                       }
                   
                   }
               
               }
               
    
    
     }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    public static boolean bodys(){
        if(CP.get(i).equals("strc")||CP.get(i).equals("DT")||CP.get(i).equals("}")){
               if(CP.get(i).equals("strc")||CP.get(i).equals("DT")){
                   if(CP.get(i).equals("strc")||CP.get(i).equals("DT")){
//                       System.out.println("DT hogi"+CP.get(i));
                       
                        
                       if(struc_mst()){
                         // System.out.println("DT sdasdahogi"+CP.get(i));
                            
                           return true;
                       
                       
                       }
               
               
               
               }
               
               
               
               }
               
               else if(CP.get(i).equals("}")){
               
               return true;
               }
        
        
        
        }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
        return false;
    }
    
    public static boolean struc_mst(){
        if(CP.get(i).equals("strc")||CP.get(i).equals("DT")||CP.get(i).equals("}")){
            
            if(CP.get(i).equals("strc")||CP.get(i).equals("DT")){
            if(CP.get(i).equals("strc")||CP.get(i).equals("DT")){
            
            // System.out.println("DT hhogi ok"+CP.get(i));
            if(struc_sst()){
                i++;
//                System.out.println("DT h,hogi ok"+CP.get(i));
                
                if(struc_mst()){
                //System.out.println("DTdsdasd ye aaega"+CP.get(i));
                return true;
                }
            
            }
            
            }
            
            
            }
            else if(CP.get(i).equals("}")){
                return true;
            
            }
        }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean struc_sst(){
     if(CP.get(i).equals("strc")||CP.get(i).equals("DT")){
          if(CP.get(i).equals("DT")){
            // System.out.println("DT ye aaega"+CP.get(i));
          if(CP.get(i).equals("DT")){
              
              
              if(struc_decl()){
//                  i++;
//                  System.out.println("; jkl ye aaega"+CP.get(i));               

                  return true;
              
              }
          }
          
          }
          else  if(CP.get(i).equals("strc")){
          if(CP.get(i).equals("strc")){
              
             
              if(str_def()){
                  
                  return true;
              
              }
          }
          
          }
     
     
     }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    public static boolean struc_decl(){
        
          String[] enteries4=new String[5];
        if(CP.get(i).equals("DT")){
        
        if(CP.get(i).equals("DT")){
             sltype=VP.get(i);
            i++;
           
            
//           System.out.println("ID h,hogi ok"+CP.get(i));
            
            if(CP.get(i).equals("ID")){
                slname=VP.get(i);
                i++;
              //  System.out.println(";  lj;hogi ok"+CP.get(i));
                
                
                    if(struc_arr()){
                                        
                                        sltype+=sltype2;
                                        
                                      enteries4[0]=sname; 
                                      enteries4[1]=slname;
                                      enteries4[2]=sltype;
                                      enteries4[3]=slscope+scope;
                                      enteries4[4]=slsize;
                                      
                                      
                                        for(int d=0;d<slinkid;d++){
                                        if ((lookupstrclink.get(d)[0].equals(enteries4[0])) &&
                                                (lookupstrclink.get(d)[1].equals(enteries4[1]))&&(lookupstrclink.get(d)[3].equals(enteries4[3]))){
                                            System.out.println("structure variable redeclearation error at line number"+line.get(i));
                                            result5="yes";
                                            break;
                                            }
                                            }

        
                                          if(!"yes".equals(result5)){
                                          lookupstrclink.put(slinkid,enteries4);
                                             slinkid++;
                                           System.out.println("Structure Variable inserted");
                                           }
                                          
                                          
                                                   
               
                                         for(int c=0;c<slinkid;c++){
                                                System.out.println("Table Structre with variables->"+Arrays.toString(lookupstrclink.get(c)));
                                                    }
//                                      after inserting values make all values to default

                                                 //sltype="";
                                                 slname="";
                                                 dsize="-";
                                                 result5="";
                                                 //slscope="";
                                      

                        
                        if(struc_list()){
                            
//                           System.out.println(";  khogi ok"+CP.get(i));
                                if(CP.get(i).equals("]")){
                                    i++;
                                }
                           if(CP.get(i).equals(";")){
                               
                           return true;
                           }
                        
                        }
                    
                    }
                
                }
                
            
            
        
        }
        
        }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    public static boolean struc_list(){
        
        String[] enteries4=new String[5];
        if(CP.get(i).equals("_")||CP.get(i).equals(";")||CP.get(i).equals("]")){
            
            if(CP.get(i).equals("_")){
                if(CP.get(i).equals("_")){
                i++;
                if(CP.get(i).equals("ID")){
                    slname=VP.get(i);
                    
                                        
                                      enteries4[0]=sname; 
                                      enteries4[1]=slname;
                                      enteries4[2]=sltype;
                                      enteries4[3]=slscope+scope;
                                      enteries4[4]=slsize;
                                      
                                      
                                        for(int d=0;d<slinkid;d++){
                                        if ((lookupstrclink.get(d)[0].equals(enteries4[0])) &&
                                                (lookupstrclink.get(d)[1].equals(enteries4[1]))&&(lookupstrclink.get(d)[3].equals(enteries4[3]))){
                                            System.out.println("structure variable redeclearation error at line number"+line.get(i));
                                            result5="yes";
                                            break;
                                            }
                                            }

        
                                          if(!"yes".equals(result5)){
                                          lookupstrclink.put(slinkid,enteries4);
                                             slinkid++;
                                           System.out.println("Structure Variable inserted");
                                           }
                                          
                                          
                                                   
               
                                         for(int c=0;c<slinkid;c++){
                                                System.out.println("Table Structre with variables->"+Arrays.toString(lookupstrclink.get(c)));
                                                    }
//                                      after inserting values make all values to default

//                                                 sltype="";
                                                 slname="";
                                                 dsize="-";
                                                 result5="";
//                                                 slscope="";
                                      
                    
                    
                i++;
                    if(struc_list()){
                    
                    return true;
                    }
                
                }
                
                }
            
            
            }
            else if(CP.get(i).equals(";")){
            
        return true;
        }
            else if(CP.get(i).equals("]")){
                
                return true;
            }
        }
        
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
        
    return false;
    }
    public static boolean struc_arr(){
        
        if(CP.get(i).equals("[")||CP.get(i).equals("_")||CP.get(i).equals(";")){
            
            if(CP.get(i).equals("[")){
            if(CP.get(i).equals("[")){
                sltype2+=VP.get(i);
                i++;
                //System.out.println("int hoga"+CP.get(i));
               
                if(K_str()){
                    
                  i++;
                    // System.out.println("] ok"+CP.get(i));
                    
                    if(CP.get(i).equals("]")){
                    sltype2+=VP.get(i);
                        return true;
                    }
                    
                }
            
            }
            
            }
            else if(CP.get(i).equals("_")||CP.get(i).equals(";")){
        
            return true;
                }
        }
//        
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
        return false;
    }
    public static boolean K_str(){
    if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("]")){
        
        if(CP.get(i).equals("Integer Constant")){
            slsize=VP.get(i);
            return true;
        }
        else if(CP.get(i).equals("]")){
        i--;
        
        return true;
        }
    
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
   
    public static boolean while_st(){
        String check=Glabel();
        System.out.println(ANSI_RED+check+ANSI_RESET);
     if(CP.get(i).equals("while")){
         
         if(CP.get(i).equals("while")){
         i++;
//         System.out.println("ye hona chai ("+CP.get(i));
         if(CP.get(i).equals("(")){
          i++;
             if(l()){
//                 System.out.println("ye hona chai ) "+CP.get(i)); 
             if(CP.get(i).equals(")")){
                 System.out.println(ANSI_RED+"if("+Gtemp2()+"==false)"+ANSI_RESET);//icg
                 String check2=Glabel();
               String check3=check2.substring(0,check2.length()-1);
                 
                  System.out.println(ANSI_RED+"JMP "+check3+ANSI_RESET);//icg
                  
                 i++;
              
                 if(body()){
                     check=check.substring(0,check.length()-1);
                     System.out.println(ANSI_RED+"JMP "+check+ANSI_RESET);
                     System.out.println(ANSI_RED+check2+ANSI_RESET);
                    System.out.println("while parsed");
                 return true;
                 }
             }
             }
         
         }
       
         }
         
        
     }
     System.out.println("Error at line number"+line.get(i)+"CP is"+CP.get(i)+"VP is:"+VP.get(i));   
    return false;
    }
    
    public static boolean body(){
        if(CP.get(i).equals("{")){
//            System.out.println(CP.get(i));
            

            if(CP.get(i).equals("{")){
                st.push(scope++);
                
               i++; 
//               System.out.println(CP.get(i));
            if(m_st()){
//                  System.out.println("asda"+CP.get(i));
                if(CP.get(i).equals("}")){
                    scope=(int) st.pop();
//                    System.out.println("Scope---------------------------------------------------->"+scope);
                
                    return true;
                }
                
            }
        
        }
        }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean m_st(){
        if(CP.get(i).equals("while")||CP.get(i).equals("if")||CP.get(i).equals("strc")||CP.get(i).equals("call")||
                CP.get(i).equals("lock")||CP.get(i).equals("do")||CP.get(i).equals("shift")
                ||CP.get(i).equals("continue")||CP.get(i).equals("break")||CP.get(i).equals("}")
                ||CP.get(i).equals("ID")||CP.get(i).equals("INCDEC")||CP.get(i).equals("DT")||CP.get(i).equals("AM")||CP.get(i).equals("return")){
            
             if(CP.get(i).equals("while")||CP.get(i).equals("if")||CP.get(i).equals("strc")||
                     CP.get(i).equals("call")||CP.get(i).equals("lock")||CP.get(i).equals("do")||CP.get(i).equals("shift")
                ||CP.get(i).equals("continue")||CP.get(i).equals("break")||CP.get(i).equals("return") 
                     ||CP.get(i).equals("ID")||CP.get(i).equals("INCDEC")||CP.get(i).equals("DT")||CP.get(i).equals("AM")){
                
                 
              
//                 System.out.println("yoyo"+VP.get(i));
                 if(s_st()){
                 i++;
                 
                 if(CP.get(i).equals(")")){ //jugar ) ) for switch and defaults waghera
                     i++;
                 }
//                 System.out.println("yoyo"+CP.get(i));
                     if(m_st()){
                         
                
                     return true;
                     }
                 }
             }
                 else if(CP.get(i).equals("}")){
                  
                    return true;
                 }
             
             
        
        
        
        }
//System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    
   }
    
    public  static boolean s_st(){
          if(CP.get(i).equals("while")||CP.get(i).equals("if")||CP.get(i).equals("strc")||CP.get(i).equals("lock")||CP.get(i).equals("do")
                ||CP.get(i).equals("continue")||CP.get(i).equals("break")||CP.get(i).equals("return")
                  ||CP.get(i).equals("shift")||CP.get(i).equals("INCDEC")
                     ||CP.get(i).equals("ID")||CP.get(i).equals("DT")||CP.get(i).equals("AM")||CP.get(i).equals("call")){
              
              if(CP.get(i).equals("while")){
                  
              if(while_st()){
               return true;
              }
              
              }
              
              else if(CP.get(i).equals("if")){
                  
              if(if1()){
               return true;
              }
              }
              
              else if(CP.get(i).equals("do")){
                  
                  if(do_while()){
                  
                      return true;
                  }
              
              }
              else if(CP.get(i).equals("shift")){
                  
                  if(switch_st()){
                  
                      return true;
                  }
              
              }
               else if(CP.get(i).equals("call")){
                  
                  if(func_call()){
                  
                      return true;
                  }
              
              }
               else if(CP.get(i).equals("strc")){
                  
                  if(struct_init()){
                  
                      return true;
                  }
              
              }
              
              
              
              
              else if(CP.get(i).equals("break")){
                  
                      return true;
              
              }
              else if(CP.get(i).equals("return")){
              
                    if(return_st()){
                    
                        return true;
                    }
              }
               else if(CP.get(i).equals("DT") || CP.get(i).equals("AM")){
              
                    if(decl()){
                    
                        return true;
                    }
              }
                else if(CP.get(i).equals("lock")){
                    
                    if(lock()){
                    
                        return true;
                    }
               
               }
                else if(CP.get(i).equals("ID")){
                    System.out.println(VP.get(i));
                    if(assign()){
                    
                        return true;
                    }
               
               }
                else if(CP.get(i).equals("INCDEC")){
                    
                    if(assign()){
                    
                        return true;
                    }
               
               }
              
              
              else if(CP.get(i).equals("continue")||CP.get(i).equals("break")){
              
              
              return true;
              }
          }
//         System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));     
      return false;
    }
    public static boolean do_while(){
            String check=Glabel();
             String check3=check.substring(0,check.length()-1);
            System.out.println(ANSI_RED+check+ANSI_RESET);
        if(CP.get(i).equals("do")){
          if(CP.get(i).equals("do")){
                i++;
//                System.out.println("Hello"+CP.get(i));
                if(body()){
                    i++;
                    if(CP.get(i).equals("until")){
                        
                        i++;
                        if(CP.get(i).equals("(")){
                            
                            i++;
                            
                            if(l()){
                                
                                if(CP.get(i).equals(")")){
                            System.out.println(ANSI_RED+"if("+Gtemp2()+"==false)"+ANSI_RESET);
                             System.out.println(ANSI_RED+"JMP "+check3+ANSI_RESET);
                            
                                i++;
                                
                                if(CP.get(i).equals(";")){
                                   System.out.println("doWhile parsed");
                                return true;
                                }
                                
                                }
                            
                            }
                        
                        }
                    
                    }
                
                }
        
        }
        
        
        }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
          
//expression
    public static boolean l(){
       if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC") ||CP.get(i).equals("call")||CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant"))
        {
            if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||CP.get(i).equals("(") ||CP.get(i).equals("call")||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
//                i++;
//              System.out.println("ID hoga yahan"+VP.get(i));
                if(R()){
//                   i++;
                    
//                     System.out.println("??"+CP.get(i));
                     
                     
//                     if(CP.get(i).equals(")")){
//                         i++;
//                         if(!CP.get(i).equals(";")){
//                             
//                             i--;
//                         
//                         }
//                     }
                     
//                     System.out.println("????"+CP.get(i));
                if(l1()){
                    t1="";
                    t2="";
                    t3="";
                    res1="";
                    res2="";
                    res3="";
                    icg1="";
                    icgcount=0;
                    icg2="";
                    icgcount2=0;
                    icgcount3=0;
                    flagicg="";
                   System.out.println("Expresseion parsed");
                    return true;
                }
                
                }
            
            }
           
       
       }

       return false;
       }
     public static boolean l1(){
         if(CP.get(i).equals("ANDOR")||CP.get(i).equals(")")||CP.get(i).equals("]")||CP.get(i).equals(";")||CP.get(i).equals("_")){
         if(CP.get(i).equals("ANDOR")){
             
//                     System.out.println("jkh"+CP.get(i));
               i++;
                if(R()){
                    
//                     System.out.println("jkh"+CP.get(i));
                    if(l1()){
                    
                        return true;
                    
                    }
                
                }
         }
         else if(CP.get(i).equals(")")||CP.get(i).equals("]")||CP.get(i).equals(";")){
             
             return true;
         }
         
         else if(CP.get(i).equals("_")){
             if(D_func()){
             
                 return true;
             }
         
         }
         
         }
         
//         System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
     return false;
     }
     public static boolean R(){
             if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||CP.get(i).equals("call")||CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
                 
                if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||CP.get(i).equals("(")||CP.get(i).equals("call")||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
                        
//                    i++;
//                    System.out.println("ID hoga yahan"+VP.get(i));
                    if(O()){
                     
//                        System.out.println("_"+CP.get(i));
                        if(R1()){
                    
                     return true;
                    }
                    
                    }
                }
             }
//             System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
         return false;
         }
     
     public static boolean R1(){
     if(CP.get(i).equals("RO")||CP.get(i).equals("ANDOR")||CP.get(i).equals(")")||CP.get(i).equals("]")||CP.get(i).equals(";")||CP.get(i).equals("_")){
         
         if(CP.get(i).equals("RO")){
             
             if(CP.get(i).equals("RO")){
              i++;  
                 if(O()){
                 
                     if(R1()){
                     
                         return true;
                     }
                 }
             
             }
         
         }
         else if(CP.get(i).equals("ANDOR")||CP.get(i).equals(")")||CP.get(i).equals("]")||CP.get(i).equals(";")||CP.get(i).equals("_")){
         
                return true;
         }
     
     }
//     System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
     return false;
     }
     public static boolean O(){
         if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||CP.get(i).equals("(")
                 ||CP.get(i).equals("call")||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
             
             if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||CP.get(i).equals("(")||CP.get(i).equals("call")||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
                 
//                 i++;
                 if(E()){
//                     System.out.println("hh"+CP.get(i));
                     if(O1()){
                     
                     return true;
                     }
                 }
             
             }
         
         }
//     System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
         return false;
     }
         
     public static boolean O1(){
     
          if(CP.get(i).equals("ADDSUM")||CP.get(i).equals("RO")||CP.get(i).equals("ANDOR")||CP.get(i).equals(")")||CP.get(i).equals("]")
                  ||CP.get(i).equals("_")||CP.get(i).equals(";")){
          
              if(CP.get(i).equals("ADDSUM")){
                  
                  if(CP.get(i).equals("ADDSUM")){
                      i++;
                      
//                       System.out.println("Zaidi"+VP.get(i));
                       
                      if(E()){
//                          System.out.println("Zaidi1345"+VP.get(i));
                          if(O1())
                          {
                             return true;
                          }
                      
                      }
                  
                  }
              
              }
              else if(CP.get(i).equals("RO")||CP.get(i).equals("ANDOR")||CP.get(i).equals(")")||CP.get(i).equals("]")
                      ||CP.get(i).equals("_")||CP.get(i).equals(";")){
                  
                  return true;
              }
          
          }
//          System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
     return false;
     }
     public static boolean E(){
     
            if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||CP.get(i).equals("(")||CP.get(i).equals("call")||CP.get(i).equals("ID")
                    ||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
                
                if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||CP.get(i).equals("(")||CP.get(i).equals("call")
                        ||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
//                i++; 
//            System.out.println("ins"+VP.get(i));
                if(F()){
                    
//                     System.out.println("asad zaidi"+VP.get(i));
                     if(CP.get(i).equals("Integer Constant")||
                     CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| 
                            CP.get(i).equals("String Constant")){
                     i++;
                    }
                     if( CP.get(i).equals("INCDEC")){
                     i++;
                     
//                     if(CP.get(i).equals(")")){
//                         
//                     }
                      if(!CP.get(i).equals(")")){
                     i+=1;
                     }
                      
                      
                     }
                     
//                     if(CP.get(i).equals(")")){
//                         i++;
//                         if(!CP.get(i).equals(")")){
////                            i--; 
//                             
//                         }
//                     }
                     
//                     System.out.println("sdsdasdas"+VP.get(i));


                    if(E1()){
//                      System.out.println("geo to aese"+CP.get(i));
                    return true;
                    }
                }
                
                
                }
            
            }
//            System.out.println("Helloasad");
//System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
     return false;
     }
     public static boolean E1(){
     
//         System.out.println("addsumaega"+CP.get(i));
            if(CP.get(i).equals("DIVMOD")||CP.get(i).equals("MUL")||CP.get(i).equals("ADDSUM")||CP.get(i).equals("RO")||CP.get(i).equals("ANDOR")||
               CP.get(i).equals(")")|| CP.get(i).equals("]")||CP.get(i).equals("_")||CP.get(i).equals(";")){
                
             if(CP.get(i).equals("DIVMOD")||CP.get(i).equals("MUL")){
                    if(CP.get(i).equals("DIVMOD")||CP.get(i).equals("MUL")){
                        System.out.println("kjhkhi"+VP.get(i));
                        
                        
                     i++;
//                     System.out.println(VP.get(i));
                     if(F()){
//                         i++;
        System.out.println("aasd"+CP.get(i));
                     if(E1()){
                 
                         return true;
                     }
                     }
                     }
             
             }
             else if(CP.get(i).equals("ADDSUM")||CP.get(i).equals("RO")||CP.get(i).equals("ANDOR")||
               CP.get(i).equals(")")|| CP.get(i).equals("]")||CP.get(i).equals("_")||CP.get(i).equals(";")){
                    
                 return true;
             }
            
            }
//            System.out.println("asdasd");
//         System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
         return false;
     }
     
     public static boolean F(){
      if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||CP.get(i).equals("call")||CP.get(i).equals("(")||CP.get(i).equals("ID")
              ||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
          

           if(CP.get(i).equals("NOT")){
//                         System.out.println("asdas");
               if(CP.get(i).equals("NOT")){
                   i++;
                   if(M()){
                       
                       return true;
                   }
                   
               }
           
           }
           else if(CP.get(i).equals("INCDEC")||CP.get(i).equals("(")||CP.get(i).equals("call")||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
               
               
//               System.out.println("hunn"+VP.get(i));
//        i++;
               if(G()){
//                    System.out.println("con hoga yahan"+VP.get(i));
                   return true;
               
               }
           
           }
           
      }
      System.out.println("F :Error at line number"+line.get(i)+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
            
        return false;
     }
     
     public static boolean G(){
         
         if(CP.get(i).equals("INCDEC")||CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("call")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
         
             if(CP.get(i).equals("INCDEC")){
                
                 if(CP.get(i).equals("INCDEC")){
                     i++;
                     
                     if(CP.get(i).equals("ID")){
                         resinc="";
                        String check2=VP.get(i);
                          String scopecheck2;
                        scopecheck2=""+scope;
                        
                        //lookup
                        
                          for(int d=0;d<did;d++){
                        if ((lookupdecl.get(d)[2].equals(check2)&&lookupdecl.get(d)[4].equals(scopecheck2))||(lookupdecl.get(d)[2].equals(check2)&&lookupdecl.get(d)[4].equals("0"))
                    ||(lookupdecl.get(d)[2].equals(check2)&&lookupdecl.get(d)[0].equals("open")||lookupdecl.get(d)[0].equals("shelter"))){
                             t5=lookupdecl.get(d)[1];
                             resinc="yes";
                            }
                         
                         }
                         if("".equals(resinc)){
                             System.out.println(check2+"-> Can not find symbol or variable is not defined");
                         }
                        
                        
                        

                         i++;
//                     
                         if(H()){
                             return true;
                         }
                     }
                 
                 }
             
             
             }
             else if(CP.get(i).equals("(")){
             
//             i++;
//             System.out.println("ID"+VP.get(i));
             if(M()){
                
                 return true;
             }
             
             }
             else if(CP.get(i).equals("ID")){
                 //icg
                 icg1+=VP.get(i);
                 icgcount++;
                 String checkicg="";
                 
                   if(icgcount==3 && icgcount2!=2){
                      checkicg=Gtemp();
                     System.out.println(ANSI_RED+checkicg+"="+icg1+ANSI_RESET);
                     a3.add(checkicg);
                     icg1="";
                     icgcount=0;
                     icgcount2++;
                     
                     }
                   
                    if(icgcount2==2){
                     String check2=Gtemp();
                     System.out.println(ANSI_RED+check2+"="+a3.get(0)+icg2+a3.get(1)+ANSI_RESET);
                     a4.add(check2);
                         icg2="";
                         icgcount2=0;
                         a3.clear();
                         icgcount3++;
                         flagicg="yes";
                }
                    
                      if(icgcount3==2){
                     String check2=Gtemp();
                     System.out.println(ANSI_RED+check2+"="+a4.get(0)+icg3+a4.get(1)+ANSI_RESET);
                     a4.add(check2);
                         icg2="";
                         icgcount3=0;
                         a4.clear();
                         
                }
                 
                 //icg
                 
                 
                 
                String check=VP.get(i);
                String scopecheck;
                scopecheck=""+scope;
                //for id for function calling
                
                    if("yes".equals(flag1)){ 
                    fcresult="";
                        fcid=VP.get(i);
                        
                         for(int d=0;d<did;d++){
                        if ((lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[4].equals(scopecheck))||(lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[4].equals("0"))
                    ||(lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[0].equals("open")||lookupdecl.get(d)[0].equals("shelter"))){
                             fctype=lookupdecl.get(d)[1];
                             func_call_arg+=fctype;
                            fcresult="yes";
                            }
                         
                         }
                         if("".equals(fcresult)){
                             System.out.println(fctype+"-> Can not find symbol or variable is not defined");
                         }
                        
                        
                    }
                    
                     //for id for function calling

                         //LOOKUP
                                        
                                        if("".equals(t1)){
                                            for(int d=0;d<did;d++){
            if((lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[4].equals(scopecheck))||(lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[4].equals("0"))
          ||(lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[0].equals("open")||lookupdecl.get(d)[0].equals("shelter"))){
                                                t1=lookupdecl.get(d)[1];
                                                t5=t1;
                                                res1="yes";
                                                break;
                                            }
                                        else{
                                        
                                            res1="no";
                                        }
                                           }
                                        }
                                        else{
                                        
                                            for(int d=0;d<did;d++){
         if ((lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[4].equals(scopecheck))||(lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[4].equals("0"))
          ||(lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[0].equals("open")||lookupdecl.get(d)[0].equals("shelter"))){
                                                t2=lookupdecl.get(d)[1];
                                                res2="yes";
                                                break;
                                            }
                                        else{
                                        
                                            res2="no";
                                        }
                                           }
                                        
                                        }
                                            
//                                      System.out.println("asad1"+t1);
//                                            System.out.println("asad2"+t2);

                                            if("Integer Constant".equals(t1)){
                                                t1="integer";
                                                t5=t1;
                                            }
                                            else if("Character Constant".equals(t1)){
                                                t1="chr";
                                                t5=t1;
                                            }
                                            else if("Floating Constant".equals(t1)){
                                                t1="flt";
                                                t5=t1;
                                            }
                                             else if("String Constant".equals(t1)){
                                                t1="str";
                                                t5=t1;
                                            }
                                            
                                             if("Integer Constant".equals(t2)){
                                                t2="integer";
                                            }
                                            else if("Character Constant".equals(t2)){
                                                t2="chr";
                                            }
                                            else if("Floating Constant".equals(t2)){
                                                t2="flt";
                                            }
                                             else if("String Constant".equals(t2)){
                                                t2="str";
                                            }

                                            
                                            //IF IN TABLE THEN CHECKING COMPATIBLITY
                                            
                                                //int c=b+c;
                                            if("yes".equals(res1)&&"yes".equals(res2)&&!"yes".equals(flag1)){
                                                if(!t1.equals(t2)){
                                                    System.out.println(t1+"->"+t2+"("+check+")"+ "Type Mismatched error at line number:"+line.get(i));
                                                
                                                }

                                                else{
                                                    
                                                    t3=t1;
                                                    t4=t1;  //storing brcause after passing expression  t3 t1 t2 becomes " "
                                                    res3="yes";
                                                    t1="";
                                                    t2="";
                                                    res1="";
                                                    res2="";
                                                }
                                            }
                                            
                                            //t3,t1
                                            if("yes".equals(res1)&&"yes".equals(res3)&&!"yes".equals(flag1)){
                                            if(!t3.equals(t1)){
                                                    System.out.println(t3+"->"+t1+"("+check+")"+ "Type Mismatched error at line number:"+line.get(i));
                                                t1="";
                                                }
                                            else{
                                                t3=t1;
                                               t4=t1; 
                                                res3="yes";
                                                   t1="";
                                                    t2="";
                                                    res1="";
                                                    res2="";
//                                            
                                            }
                                            
                                            }
                                            
                                           
                                            
                                            
                                            //IF NOT IN TABLE THEN NOT FOUND ERROR
                                            if("no".equals(res1)){
                                                  System.out.println(VP.get(i)+" is not defined or cannot find symbol at line number:"+line.get(i));
                                            
                                            }
//                                            IF NOT IN TABLE THEN NOT FOUND ERROR
                                            if("no".equals(res2)){
                                                  System.out.println(VP.get(i)+" is not defined or cannot find symbol at line number:"+line.get(i));
                                            }
        

             
                 
                 i++;
//                  System.out.println("hello"+CP.get(i));
//                 System.out.println("fs"+VP.get(i));
                 if(G1()){
                     
                     return true;
                 }
             }
             else if(CP.get(i).equals("call")){
                 
//                  System.out.println("hello"+CP.get(i));
//                 System.out.println("fs"+CP.get(i));
                 if(func_call()){
                     
                     return true;
                 }
             }
             
             else if(CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
             
                 if(cons()){
                    String check=CP.get(i);

                    
                                        //LOOKUP
                                        if("".equals(t1)){
                                            
                                            t1=check;
                                            res1="yes";
                                        }
                                        else{
                                        
                                            t2=check;
                                            res2="yes";
                                         }
                                        
                                           if("Integer Constant".equals(t1)){
                                                t1="integer";
                                                t5=t1;
                                            }
                                            else if("Character Constant".equals(t1)){
                                                t1="chr";
                                                t5=t1;
                                            }
                                            else if("Floating Constant".equals(t1)){
                                                t1="flt";
                                                t5=t1;
                                            }
                                             else if("String Constant".equals(t1)){
                                                t1="str";
                                                t5=t1;
                                            }
                                           
                                            
                                             if("Integer Constant".equals(t2)){
                                                t2="integer";
                                            }
                                            else if("Character Constant".equals(t2)){
                                                t2="chr";
                                               
                                            }
                                            else if("Floating Constant".equals(t2)){
                                                t2="flt";
                                            }
                                             else if("String Constant".equals(t2)){
                                                t2="str";
                                            }
        
                                            //IF IN TABLE THEN CHECKING COMPATIBLITY
                                            
                                                //int c=b+c;
                                            if("yes".equals(res1)&&"yes".equals(res2)&&!"yes".equals(flag1)){
                                                if(!t1.equals(t2)){
                                                    System.out.println(t1+"->"+t2+"("+check+")"+ "Type Mismatched error at line number:"+line.get(i));
                                                
                                                }
                                                
                                                else{
                                                    
                                                    t3=t1;
                                                    t4=t1;
                                                    res3="yes";
                                                    t1="";
                                                    t2="";
                                                    res1="";
                                                    res2="";
                                                }
                                            }
                                            
                                            //t3,t1
                                            if("yes".equals(res1)&&"yes".equals(res3)&&!"yes".equals(flag1)){
                                            if(!t3.equals(t1)){
                                                    System.out.println(t3+"->"+t1+"("+check+")"+ "Type Mismatched error at line number:"+line.get(i));
                                                    t1="";
                                                }
                                               else{
                                                t3=t1;
                                                t4=t1;
                                                res3="yes";
                                                   t1="";
                                                    t2="";
                                                    res1="";
                                                    res2="";
//                                            
                                            }
                                            
                                            }
                                            
                 return true;
                 }
             }
         
         }
//         System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
     return false;
     }
     public static boolean cons(){
        if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")||
            CP.get(i).equals("String Constant")){
           if("yes".equals(flag1)){
            func_call_arg+=CP.get(i);
           }
                return true;
             }
//     System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
     return false;
     }
     public static boolean G1(){
          if(CP.get(i).equals("[")||CP.get(i).equals("INCDEC")||CP.get(i).equals("DIVMOD")||
            CP.get(i).equals("MUL")||CP.get(i).equals("ADDSUM")||CP.get(i).equals("RO")||CP.get(i).equals(")")||CP.get(i).equals("(")||CP.get(i).equals("]")||
                  CP.get(i).equals("ANDOR")||CP.get(i).equals(";")||CP.get(i).equals("@")||CP.get(i).equals("_")){
               if(CP.get(i).equals("[")){
                   
                   if(CP.get(i).equals("[")){
                       
                       if(H()){
//                          System.out.println("dsda"+CP.get(i)); 
                          i++;
                           if(G2()){
                               
                               return true;
                           
                           }
                       
                       }
                   
                   }
               }
//               else if( CP.get(i).equals("("))
//               {
//                   
//               
//                }
//                   System.out.println("("+CP.get(i));
//                   i++;
////                    System.out.println("id const arg may jay ga"+CP.get(i));
//                   if(arg_ass())
//                   {
//                       //i++;
////                        System.out.println(") FUNC KHTM"+CP.get(i));
//                       if( CP.get(i).equals(")"))     {
//                       return true;
//                   }
//                   
//               }
               
               else if(CP.get(i).equals("@"))
               {
                   if(CP.get(i).equals("@")) {
                       i++;
                       if(s2()) {
                   return true;
                   }
               }
               }
                   else if(CP.get(i).equals("INCDEC")||CP.get(i).equals("DIVMOD")||
            CP.get(i).equals("MUL")||CP.get(i).equals("ADDSUM")||CP.get(i).equals("RO")||CP.get(i).equals(")")||CP.get(i).equals("]")||
                  CP.get(i).equals("ANDOR")||CP.get(i).equals(";")||CP.get(i).equals("_")){
                       
                       if(CP.get(i).equals("RO")||CP.get(i).equals("ANDOR")){
                           t1="";
                           t3="";
//                           t2="";
                       
                       }
//                         i++;
                if("yes".equals(flagicg)){
                    icg3=VP.get(i);
                
                    flagicg="";
                }
                    if(icgcount==0){
                        icg2=VP.get(i);
//                        icgcount2++;
                    }
                   else{
                        icg1+=VP.get(i);
                        icgcount++;
                        if(icgcount==3){
                      String check=Gtemp();
                     System.out.println(ANSI_RED+check+"="+icg1+ANSI_RESET);
                     check=icg1;
                     icg1="";
                     icgcount=0;
                     icgcount2++;
                                     }
                    }
                       return true;
                   }
               
               
              
          
          }
//     System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
     return false;
     }
     public static boolean G2(){
     if(CP.get(i).equals("INCDEC")||CP.get(i).equals("DIVMOD")||
            CP.get(i).equals("MUL")||CP.get(i).equals("ADDSUM")||CP.get(i).equals("RO")||CP.get(i).equals(")")||CP.get(i).equals("]")||
                  CP.get(i).equals("ANDOR")||CP.get(i).equals(";")||CP.get(i).equals("_")||CP.get(i).equals("@")){
         if(CP.get(i).equals("INCDEC")){
//             i++;
         return true;
         }
         else if(CP.get(i).equals("@")) {
             i++;
             if(s2())
             { i++;
                 return true;
             }
         }
         
         
         else if(CP.get(i).equals("DIVMOD")||
            CP.get(i).equals("MUL")||CP.get(i).equals("ADDSUM")||CP.get(i).equals("RO")||CP.get(i).equals(")")||CP.get(i).equals("]")||
                  CP.get(i).equals("ANDOR")||CP.get(i).equals(";")||CP.get(i).equals("_")){
//         System.out.println(CP.get(i));
             return true;
         }
         
     
     }
//     System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
                 return false;
     }
     public static boolean M(){
         if(CP.get(i).equals("(")){
              if(CP.get(i).equals("(")){
                i++;
//                 System.out.println(CP.get(i));
                  if(l()){
//                  i++;
//        System.out.println("exp ka return M me"+VP.get(i));
                       if(CP.get(i).equals("]")){
                          i++;
                            }
                      if(CP.get(i).equals(")")){
                      
                  
                      return true;
                  }
                  }
              
              }
         }
//         System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
         return false;
     }
     public static boolean H(){
     if(CP.get(i).equals("[")||CP.get(i).equals("DIVMOD")||CP.get(i).equals("INCDEC")||
            CP.get(i).equals("MUL")||CP.get(i).equals("ADDSUM")||CP.get(i).equals("RO")||CP.get(i).equals(")")||CP.get(i).equals("]")||
                  CP.get(i).equals("ANDOR")||CP.get(i).equals(";")){
     
         if(CP.get(i).equals("[")){
             
             if(CP.get(i).equals("[")){
                 
                 if(arr_exp()){
                     return true;
                 }
             }
         
         }
         else if(CP.get(i).equals("DIVMOD")||CP.get(i).equals("INCDEC")||
            CP.get(i).equals("MUL")||CP.get(i).equals("ADDSUM")||CP.get(i).equals("RO")||CP.get(i).equals(")")||CP.get(i).equals("]")||
                  CP.get(i).equals("ANDOR")||CP.get(i).equals(";")){
             return true;
             }
     
     }
//     System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
     return false;
     }
     public static boolean arr_exp(){
     
            if(CP.get(i).equals("[")){
                if(CP.get(i).equals("[")){
                    i++;
                    if(k1()){
//                        public static int f=0;
                        //jugar
//                        i++;
                         
                        if(CP.get(i).equals("ADDSUM")||CP.get(i).equals("DIVMOD")||CP.get(i).equals("MUL")||CP.get(i).equals("RO")){
                             
                             
                             while(!CP.get(i).equals("]")){
                              i++;
                             }
                             i--;
                             if(CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
                             CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
                                 i++;
                             }
                             
                             
                        
                        }
                        
                        if(CP.get(i).equals(")")){
                             i--;
                             
                                 if(CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
                             CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")||
                                          (CP.get(i).equals(")"))){
                                 
                                 i+=1;
                                 
                             
                                }
//                                 if(CP.get(i).equals(")")){
//                                 i+=2;
//                                 
//                                 }
                             }

                         //jugar if incdec is in bracket
                        if(CP.get(i).equals("INCDEC")){
                             i++;
                         }
//                        if(CP.get(i).equals(")")){
//                             i++;
//                         }
//                        System.out.println("hello89"+VP.get(i));
                        if(CP.get(i).equals("]")){
                            return true;
                        }
                        
                    }
                
                }
            
            }
//            System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
         return false;
        }
     public static boolean k1(){
         if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||
            CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("call")||CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")
                 ||CP.get(i).equals("Character Constant")||
                  CP.get(i).equals("String Constant")|| CP.get(i).equals("]")){
             
             if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||
            CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("call")||CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")
                 ||CP.get(i).equals("Character Constant")||
                  CP.get(i).equals("String Constant")){
                   
                     i++;
//                     System.out.println("neend"+CP.get(i));
                       return true;
             }
             else if(CP.get(i).equals("]")){
             
             return true;
             }
         }
//         System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
         return false;
     }
     
     //function calling
     
     
     public static boolean func_call(){
         if(CP.get(i).equals("call")){
             if(CP.get(i).equals("call")){
//                 System.out.println("hello"+CP.get(i));
                 i++;
                 if(CP.get(i).equals("ID")){
                    String check=VP.get(i);
                  //LOOKUP
                                            for(int d=0;d<fdid;d++){
                                            if((lookupfuncdecl.get(d)[2].equals(check))){
                                            typecall=lookupfuncdecl.get(d)[5];
                                            fctype2=lookupfuncdecl.get(d)[6];
//                                            System.out.println(fctype2);
                                            resultcall="yes";
                                            break;
                                            }
                                           }

                                            
                                            //IF NOT IN TABLE THEN NOT FOUND ERROR
                                            if("".equals(resultcall)){
                                      System.out.println("function"+"'"+check+"'"+" is not defined or cannot find function at line number:"+line.get(i));
                                            }

                                     i++;
                        
                        
                        
                        
                        if(CP.get(i).equals("(")){

                        if(func_arg()){
                           if(CP.get(i).equals(")")){
                       //checking function call compatiblity here 
                
                        flag1="no";
                       if("yes".equals(resultcall)){
                          StringTokenizer st=new StringTokenizer(typecall,"_");
                          while(st.hasMoreElements()){
                              
                               a1.add(st.nextToken());
                          }
                          
                           StringTokenizer st2=new StringTokenizer(func_call_arg,"_");
                          while(st2.hasMoreElements()){
                              
                               a2.add(st2.nextToken());
                          }
                          
                          if(a1.size()!=a2.size()){
                          
                                System.out.println("Actual and formal argument different in length function calling error");
                          }
                          else{
                              //converting if integer constant to integer same is for others
                           for(int i=0;i<a2.size();i++){
                               if("Integer Constant".equals(a2.get(i))){
                                  a2.set(i, "integer");

                               }
                               if("Floating Constant".equals(a2.get(i))){
                                    a2.set(i, "flt");

                               }
                               if("Character Constant".equals(a2.get(i))){
                                a2.set(i, "chr");
                               }
                               if("String Constant".equals(a2.get(i))){
                                a2.set(i, "str");

                                 }
                               
                           }
//                           System.out.println(a1);
//                           System.out.println(a2);
                         
                           //now checking types
                            
                           for(int i=0;i<a1.size();i++){
                               
                                 if(!a1.get(i).equals(a2.get(i))){
                                       System.out.println("Argument type missmatched function calling error ");
                                       break;
                                   }
                          }
                          }
                       }
                        func_call_arg="";
                        typecall="";
                          a1.clear();
                          a2.clear();
                          System.out.println("function call parsed"+VP.get(i));
                           i++;
                                return true;
                            
                        }
         
         
         }
                        }
                 }
         
         }
         
         
         }
             
             
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
             return false;
     }
     public static boolean func_arg(){
          
          if(CP.get(i).equals(")")||CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||
            CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("call")||CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")
                 ||CP.get(i).equals("Character Constant")||
                  CP.get(i).equals("String Constant")){
         
              if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||
            CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("call")||CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")
                 ||CP.get(i).equals("Character Constant")||
                  CP.get(i).equals("String Constant")){
                  
                    flag1="yes";

                    if(l()){

//                        System.out.println(func_call_arg);
//                  System.out.println("umer sharif"+VP.get(i));
                    
                    if(D_func()){
                    
                        return true;
                    
                    }
                    }
              
              }
              else if(CP.get(i).equals(")")){
                  
                return true;
              }
         
         }
//          System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
      return false;
      }
     
      
      public static boolean D_func(){
          
          if(CP.get(i).equals("_")||CP.get(i).equals(")")){
              
              if(CP.get(i).equals("_")){
//               System.out.println(") yo yo asad zaidi zaidi"+CP.get(i));
                func_call_arg+=CP.get(i);
              i++;
              if(l()){
                  
                  
                  if(D_func()){
                  
                  return true;
                  }
              }
              
              }
              
              else if(CP.get(i).equals(")")){
                return true;
              }
          
          
          }
//          System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
      return false;
      }
      
      public static boolean assign()
{
   
if(CP.get(i).equals("ID")||CP.get(i).equals("INCDEC"))
{
    String[] enteries2=new String[5];

    if(CP.get(i).equals("ID"))
    {

             dnamee=VP.get(i);
            
            si=VP.get(i);
//             System.out.println(si+"ammi");
        i++;

        if(q_ass()) 
        {
                
//            System.out.println(VP.get(i));
            
            if(ass1())
                
                //for structure
                       {
                 if("yes".equals(result14)&&"yes".equals(result12)){
                         
                         if(!styp1.equals(typec5)){
                             
                          System.out.println(styp1+"->"+typec5+" Type Mismatched error in structure at line number:"+line.get(i));
                         }
                         
                         typec5="";
                         styp1="";
                         result12="";
                         result14="";
                     
                     }
               
             
                                 String scopecheck="";
                                 scopecheck=scopecheck+scope;
                
                                       //lookup
                                                //LOOKUP for variables
                                            for(int d=0;d<did;d++){
                                      if ((lookupdecl.get(d)[2].equals(dnamee)&&lookupdecl.get(d)[4].equals(scopecheck))||
                                              (lookupdecl.get(d)[2].equals(dnamee)&&lookupdecl.get(d)[4].equals("0"))
                                 ||(lookupdecl.get(d)[2].equals(dnamee)&&lookupdecl.get(d)[0].equals("open")||lookupdecl.get(d)[0].equals("shelter"))){
                                                typec4=lookupdecl.get(d)[1];
//                                                System.out.println(typec4+"asadzaidi");
                                            result11="yes";
                                            break;
                                            }
                                            }
                                            
//                                            System.out.println(typec5+"asadzaidi");
                                            
                                                
                                                 //IF IN TABLE THEN CHECKING COMPATIBLITY
                                            if("yes".equals(result11)&&"yes".equals(result12)){
                                                if(!typec4.equals(typec5)){
                                                    System.out.println(typec4+"->"+typec5+" Type Mismatched error at line number:"+line.get(i));
                                                
                                                }
                                            }
                                                if("".equals(result11)&&!"yes".equals(flag3)&&!"yes".equals(flag4)){
                                                  System.out.println(dnamee+" undefined at line number:"+line.get(i));
                                            }
                                            
                                            
                                              
                                              result11="";
                                              result12="";
                                              result13="";
                                             c1="";
                                             dnamee="";    
                                             typec4="";
                                             typec5="";
                                             flag3="";
                                             flag4=""; 
                                                     
                System.out.println("Assignment parsed");
                      return true;
             }
            }
        }
    else if(CP.get(i).equals("INCDEC"))
    {
            i++;
            if(CP.get(i).equals("ID"))
        {
               dnamee=VP.get(i);
                si=VP.get(i);
            i++;

            if(q_ass())
        {

            if(ass2())
                 {
                     //for structure
                   if("yes".equals(result14)&&"yes".equals(result12)){
                         
                         if(!styp1.equals(typec5)){
                             
                          System.out.println(styp1+"->"+typec5+" Type Mismatched error in structure at line number:"+line.get(i));
                         }
                         
                         typec5="";
                         styp1="";
                         result12="";
                         result14="";
                     
                     }
               
             
                                 String scopecheck="";
                                 scopecheck=scopecheck+scope;
                
                                       //lookup
                                                //LOOKUP for variables
                                            for(int d=0;d<did;d++){
                                      if ((lookupdecl.get(d)[2].equals(dnamee)&&lookupdecl.get(d)[4].equals(scopecheck))||
                                              (lookupdecl.get(d)[2].equals(dnamee)&&lookupdecl.get(d)[4].equals("0"))
                                 ||(lookupdecl.get(d)[2].equals(dnamee)&&lookupdecl.get(d)[0].equals("open")||lookupdecl.get(d)[0].equals("shelter"))){
                                                typec4=lookupdecl.get(d)[1];
//                                                System.out.println(typec4+"asadzaidi");
                                            result11="yes";
                                            break;
                                            }
                                            }
                                            
//                                            System.out.println(typec5+"asadzaidi");
                                            
                                                
                                                 //IF IN TABLE THEN CHECKING COMPATIBLITY
                                            if("yes".equals(result11)&&"yes".equals(result12)){
                                                if(!typec4.equals(typec5)){
                                                    System.out.println(typec4+"->"+typec5+" Type Mismatched error at line number:"+line.get(i));
                                                
                                                }
                                            }
                                                if("".equals(result11)&&!"yes".equals(flag3)&&!"yes".equals(flag4)){
                                                  System.out.println(dnamee+" undefined at line number:"+line.get(i));
                                            }
                                            
                                            
                                              
                                              result11="";
                                              result12="";
                                              result13="";
                                             c1="";
                                             dnamee="";    
                                             typec4="";
                                             typec5="";
                                             flag3="";
                                             flag4=""; 
//                i++;
                      System.out.println("Assigbment parsed");
                      return true;
                  }
            }
    }
    }
    }
   

return false;
}
public static boolean b_ass()
{
    if(CP.get(i).equals("=")||CP.get(i).equals("AO"))
    {
     if(CP.get(i).equals("=")||CP.get(i).equals("AO"))
    {
        i++;
        
        if(CP.get(i).equals("call")){
            flag5="yes";
         }
        
         if(l())
             
             
        {

            if("yes".equals(flag5)){
            typec5=fctype2;
            fctype2="";
            result12="yes";
            }
             else if("".equals(t3)&&!"yes".equals(flag5)){
                
                typec5=t5;
                t5="";
                result12="yes";
                 }
            
               else{
                        typec5=t4;
                         t4="";
                         result12="yes";
                  }
            
            flag5="";
          return true;  
        }
    }
    }
    
//System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean ass1()
{
    if(CP.get(i).equals("=")||CP.get(i).equals("AO")||CP.get(i).equals("@")||CP.get(i).equals(";"))
    {
     if(CP.get(i).equals("=")||CP.get(i).equals("AO"))
    {
        
        if(b_ass())
        {
            if(CP.get(i).equals(";")||CP.get(i).equals(")")){
            i--;
            }
            System.out.println("Hellasdalsd"+VP.get(i));
            i++;
            
             if(CP.get(i).equals(";")||CP.get(i).equals(")"))
             {
                 
                   
          return true;  
        
        }
        }
    }
     else if(CP.get(i).equals("@"))
    {
        if(s1())
        {
            
            if(b_ass())
            {
                
                if(CP.get(i).equals(";")){
            i--;
            }
            System.out.println("Hellasdalsd"+VP.get(i));
            i++;
                
             if(CP.get(i).equals(";"))
             {
//                 i++;
                   
          return true;  
                
            
        }
    }
    }
    }
     else if(CP.get(i).equals(";"))
      {
//          i++;
         
          return true;
                  
      }
    }
//  System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean ass2()
{
    if(CP.get(i).equals("=")||CP.get(i).equals("AO")||CP.get(i).equals("@")||CP.get(i).equals(";"))
    {
     if(CP.get(i).equals("=")||CP.get(i).equals("AO"))
    {
     
        if(b_ass())
        {
            //i++;
             if(CP.get(i).equals(";"))
             {
//                i++;
          return true;  
        }
    }
        }
    

     else if(CP.get(i).equals("@"))
    {
        if(s1())
        {
            
//           System.out.println("ab b may jay ga = ya ao---"+VP.get(i));
            if(b_ass())
            {
                 if(CP.get(i).equals(";")||CP.get(i).equals(")")){
            i--;
            }
            System.out.println("Hellasdalsd"+VP.get(i));
            i++;
             if(CP.get(i).equals(";"))
             {
//                 i++;
                   
          return true;  
                
            }
        
    }
    }
    }
     else if(CP.get(i).equals(";"))
      {
//          i++;
          
          return true;
      }
    }     
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean q_ass()
{
    
    if(CP.get(i).equals("[")||CP.get(i).equals("@")||CP.get(i).equals("INCDEC")||CP.get(i).equals("=")||CP.get(i).equals("AO"))
    {
//          System.out.println("[ incdec = ao ^ q may aye------"+CP.get(i));
        if(CP.get(i).equals("["))
        {     

            if(A_ass())
        {
            
          i++;
//           System.out.println("ab incdec or ^ = ao a skta hai"+VP.get(i));
            if(q1_ass())
            {
//                i++;
                return true;
            }
        }
        }
            else if(CP.get(i).equals("@")||CP.get(i).equals("AO")||CP.get(i).equals("="))
            {
               return true;
            }
        else if(CP.get(i).equals("INCDEC"))
            {
                
              i++;
               return true;
            }
    }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean q1_ass()
{
    if(CP.get(i).equals("INCDEC")||CP.get(i).equals("@")||CP.get(i).equals("=")||CP.get(i).equals("AO")||CP.get(i).equals(";")||CP.get(i).equals(")"))
    {
        if(CP.get(i).equals("INCDEC"))
        {   

//             System.out.println("inc dec hai"+CP.get(i));

            return true;
        }
        else if(CP.get(i).equals("@")||CP.get(i).equals("=")||CP.get(i).equals("AO")||CP.get(i).equals(";"))
        {
//     System.out.println("^ = ao  hai"+CP.get(i));
     
            return true;
        }
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean s1()
{
    if(CP.get(i).equals("@"))
    {
        if(CP.get(i).equals("@"))
        {
//            System.out.println("asdhasdas->"+result13);

            
                    // lookup for instance in structure link2 table
                    //if a1 avaialable then
                                            for(int d=0;d<slink2id;d++){
                                           if((lookupstrclink2.get(d)[1].equals(si))){
                                            strname=lookupstrclink2.get(d)[0];
                                            System.out.println(si+" is initialized with structure "+strname);
                                             result13="yes";
                                            break;
                                            }
                                             }
                                                
                                            
                                            if("".equals(result13)){
                                            System.out.println(si+" is not initialized with any structure ");
                                             flag3="yes";
                                            }
            i++;
//             System.out.println("id a skta hai ya incdec"+VP.get(i));
             
            if(s2())
            {
            return true;
            }
        }
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean s2()
{
    if(CP.get(i).equals("ID")||CP.get(i).equals("INCDEC")||CP.get(i).equals("call"))
    {
       
        
        if(CP.get(i).equals("ID"))
        {
             s=VP.get(i);
//             System.out.println("bilal"+s);
                    
 // lookup for structure link2 table  a1.x
                         if("yes".equals(result13)){
                                            //lookup for link1 variables structure whether variable is assign to that structure
                                           for(int d=0;d<slinkid;d++){
                                           if ((lookupstrclink.get(d)[1].equals(s))&&(lookupstrclink.get(d)[0].equals(strname))){
                                            styp1=lookupstrclink.get(d)[2];
//                                            System.out.println(styp1+"abu");
                                           System.out.println("Structure id found '"+si+"' defined in structure '"+strname+"'");
                                            result14="yes";
                                            flag3="yes";
                                            break;
                                            }
                                            } 
                                               }
    
            i++;

            if(s3())
         {
//             System.out.println("-->"+CP.get(i));
                return true;
            }
            
        }

        else if(CP.get(i).equals("INCDEC"))
        {
            i++;
            if(CP.get(i).equals("ID"))
            {
                s=VP.get(i);
                i++;
                if(q_ass())
                {
                    // lookup for structure link2 table
                                             for(int d=0;d<slink2id;d++){
                                           if ((lookupstrclink2.get(d)[1].equals(si))){
                                            styp=lookupstrc.get(0)[0];
                                           System.out.println("Structure initiallize id lookup-----"+styp);
                                            result13="yes";
                                            break;
                                            }
                                            } 
                                            //lookup for link1 variables structure
                                           for(int d=0;d<slinkid;d++){
                                           if ((lookupstrclink.get(d)[1].equals(s))){
                                            styp1=lookupstrc.get(d)[0];
                                           System.out.println("Structure def id lookup-----"+styp1);
                                            result14="yes";
                                            break;
                                            }
                                            } 
                                           
                                                if(!"yes".equals(result13)&&"yes".equals(result14)){
                                                  System.out.println(s+" undefined variable in structure at line number:"+line.get(i));
                                            }
                                            
                                     
                                           
                                          if("yes".equals(result13)&&"yes".equals(result14)){
                                            if(!styp.equals(styp1)){
                                             System.out.println("Type Mismatched error at line number:"+line.get(i));
                                                
                                                }
                                           

                                            }
                                          
                                          
               s="";
               si="";
               styp="";
               styp1="";
                    return true;
                }
            }
            
        }
        else if(CP.get(i).equals("call"))
        {
           
            if(CP.get(i).equals("call"))
            {
                
                if(func_call())
                {
//                    System.out.println("asd"+CP.get(i));
                    i++;
                    return true;
                }
            }
            
        }
        
        
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}

public static boolean s3()
{
     if(CP.get(i).equals("[")||CP.get(i).equals("INCDEC")||CP.get(i).equals("=")||CP.get(i).equals("AO")||CP.get(i).equals("("))
     {
         if(CP.get(i).equals("[")||CP.get(i).equals("INCDEC")||CP.get(i).equals("=")||CP.get(i).equals("AO"))
         {
             if(q_ass())
             {
                 return true;
             }
         }
         else if(CP.get(i).equals("("))
         {

             i++;

             if(arg_ass())
             {
                 //i++;
//                   System.out.println(") end hai arg ka"+CP.get(i));
                 if(CP.get(i).equals(")"))
                 {
                     i++;
                     return true;
                 }
             }
         }
        /* else if(CP.get(i).equals(")"))
         {
             return true;
         }*/
             }
 return false;   
}
public static boolean arg_ass()
{
    if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")
                 ||CP.get(i).equals("Character Constant")||
                  CP.get(i).equals("String Constant")
            ||CP.get(i).equals("ID")||CP.get(i).equals("INCDEC")
            ||CP.get(i).equals("NOT")||CP.get(i).equals("(")||
            CP.get(i).equals(")"))
    {
          if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")
                 ||CP.get(i).equals("Character Constant")
                  ||CP.get(i).equals("String Constant")
            ||CP.get(i).equals("ID")||CP.get(i).equals("INCDEC")
            ||CP.get(i).equals("NOT")||CP.get(i).equals("(")) {
//                  System.out.println("const id not ("+CP.get(i));
        if(l())
        {
            if("".equals(t3)){
                
                typec5=t5;
                t5="";
                result12="yes";
                 }
            
                 else{
                        typec5=t4;
                         t4="";
                         result12="yes";
                  }

            if(D_ass())
            {
                  i++;
                return true;
            }
        }
    }
          else if( CP.get(i).equals(")"))
          {
              return true;
          }
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean D_ass()
{
    if(CP.get(i).equals("_")||CP.get(i).equals(")"))
    {
        
        if(CP.get(i).equals("_"))
        {
//              System.out.println("| ye ho-----"+CP.get(i));
            i++;
//             System.out.println("id ho ya cons"+CP.get(i));
            if(l())
            {
               i++;
//                 System.out.println(") hoga ya |----"+CP.get(i));
                if(D_ass())
                {
                    return true;
                }
            }
        }
        else if(CP.get(i).equals(")"))
        {
//             System.out.println(") ye hoga-----"+CP.get(i));
                         return true;
        }
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean A_ass()
 {
     if(CP.get(i).equals("["))
     {
          dtypee2=VP.get(i);
         i++;
//          System.out.println("id const ]"+VP.get(i));
         if(A1())
         {
//              System.out.println("end cahhiye array ka "+CP.get(i));
             if(CP.get(i).equals("]"))
             {
                 dtypee2+=VP.get(i);
                 return true;
             }
         }
         
     }
     
//     System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
     return false;
 }
 public static boolean A1()
 {
     if(CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")
                 ||CP.get(i).equals("Character Constant")||
                  CP.get(i).equals("String Constant")||CP.get(i).equals("]")||CP.get(i).equals("INDEC")
             ||CP.get(i).equals("NOT")||CP.get(i).equals("("))
     {
         if(CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")
                 ||CP.get(i).equals("Character Constant")||
                  CP.get(i).equals("String Constant")||CP.get(i).equals("INDEC")
             ||CP.get(i).equals("NOT")||CP.get(i).equals("("))
         {

             if(l())
             {
                 if("".equals(t3)){
                
                typec5=t5;
                t5="";
                result12="yes";
                 }
             else{
                        typec5=t4;
                         t4="";
                         result12="yes";
                  }
                 
                 if(CP.get(i).equals(")")){
                     i++;
                 }
                 if(CP.get(i).equals(")")){
                 
                     i++;
                 }
                 return true;
             }
         }
         else if(CP.get(i).equals("]"))
         {
//              System.out.println("] hai"+CP.get(i));
             return true;
             }
     }
//     System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
     return false;
 }
  
      //return
      public static boolean return_st(){
          
          if(CP.get(i).equals("return")){
                if(CP.get(i).equals("return")){
                    i++;
                    if(return_st1()){
                        
                        i++;
                    if(CP.get(i).equals(";")){
                           System.out.println("return parsed");
                    return true;
                    
                    }
          
                    
                    }
          
          }
          
          }
//      System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
      return false;
      }
      public static boolean return_st1(){
          if(CP.get(i).equals("T/F")||CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||
            CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("call")||CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")
                 ||CP.get(i).equals("Character Constant")||
                  CP.get(i).equals("String Constant")){
              
               if(CP.get(i).equals("T/F")){
                   
                   return true;
               
               
               }
               else if(CP.get(i).equals("NOT")||CP.get(i).equals("INCDEC")||
            CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("call")||CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")
                 ||CP.get(i).equals("Character Constant")||
                  CP.get(i).equals("String Constant")){
                    
                   if(l()){
                   
                       return true;
                   }
               }
          
          
          }
//          System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
      return false;
      }

      //declare
       public static boolean decl()
    {
        
         String[] enteries2=new String[5];
     
    if(CP.get(i).equals("AM")||CP.get(i).equals("DT"))
    {
       
        if(a())
        {
         
            if(CP.get(i).equals("DT"))
            {
                i++;
                if(CP.get(i).equals("ID"))
                {
                    dname=VP.get(i);
                    i++;
                    if(arrdecl())
                    {
                             //lookup
                        
                         dtype+=dtype2;// 
                                        enteries2[0]=dam; 
                                        enteries2[1]=dtype;
                                        enteries2[2]=dname;
                                        enteries2[3]=dsize;
                                        enteries2[4]=dscope+scope;

                                        for(int d=0;d<did;d++){
                                        if ((lookupdecl.get(d)[2].equals(enteries2[2]))&&(lookupdecl.get(d)[4].equals(enteries2[4]))){
                                            System.out.println("variable redeclearation error at line number"+line.get(i));
                                            result2="yes";
                                            break;
                                            }
                                            }

        
                                          if(result2!="yes"){
                                          lookupdecl.put(did,enteries2);
                                             did++;
                                           System.out.println("Inserted declaration");
                                           }
                                          
                                          
                                                   
               
                                         for(int c=0;c<did;c++){
                                                System.out.println("Table->"+Arrays.toString(lookupdecl.get(c)));
                                                    }
//                                      after inserting values make all values to default
//                                                dam="-"; 
//                                                dtype="";
                                                 dtype2="";
                                                 dname="";
                                                 dsize="-";
                                                 result2="";

//                                                 dscope="";

                        
                        
                        
                        //lookup
//                      System.out.println(CP.get(i)+"Sdas");
                        if(init())
                        {
                              
                          
                           
                            if(list())
                            {
                                
                                if(CP.get(i).equals(";"))
                                {
                                    dam="-";
//                                    i++;            ///for next iteration
                                    System.out.println("Declation Parsed");
//                                    System.out.println("scope------------------------------->"+scope);
                                    return true;
                                }
                            }
                            
                        }
                    }
                }
            }
        }
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean a()
{
     if(CP.get(i).equals("AM")||CP.get(i).equals("DT"))
     {
                 if(CP.get(i).equals("AM"))
                 {
                     dam=VP.get(i);
                    i++;    
                  if(CP.get(i).equals("DT"))
                 {
                     dtype=VP.get(i);
                     typec1=VP.get(i);
                     return true;
                 }
                 }
                 else if(CP.get(i).equals("DT"))
                 {
                     dtype=VP.get(i);
                     typec1=VP.get(i);
                     return true;
                 }

     }   
//     System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    
    return false;
}
public static boolean arrdecl()
{
   
    if(CP.get(i).equals("[")||VP.get(i).equals("=")||CP.get(i).equals("_")||CP.get(i).equals(";"))
    {
        if(CP.get(i).equals("["))
        {
            dtype2=VP.get(i);
            i++;
            if(k())
            {
//                System.out.println("das"+CP.get(i));
                if(CP.get(i).equals("]"))
                {
                     dtype2+=VP.get(i);
                    i++;
                    return true;
                }
            }
        }
        else if(VP.get(i).equals("="))
                 {
                     return true;
                 }
        else if(CP.get(i).equals("_"))
                 {
                     return true;
                 }
        else if(CP.get(i).equals(";"))
                 {
                     return true;
                 }
        
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean k()
{
    if(CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
            CP.get(i).equals("INCDEC")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")
            ||CP.get(i).equals("String Constant")||CP.get(i).equals("(")||CP.get(i).equals("NOT")||CP.get(i).equals("]"))
    {
         if(CP.get(i).equals("]"))
         {
             return true;
         }
         else if(CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
            CP.get(i).equals("INCDEC")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")
            ||CP.get(i).equals("String Constant"))
         {
             if(cons())
             {
                 dsize=VP.get(i);
                 size_c=VP.get(i);
                 i++;
                 return true;
             }
         }
         else if(CP.get(i).equals("(")||CP.get(i).equals("NOT"))
         {
             return true;
         }
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean init()
{
    if(VP.get(i).equals("=")||CP.get(i).equals("_")||CP.get(i).equals(";"))
    {
        
        if(VP.get(i).equals("="))
            
        {
//            System.out.println(CP.get(i));
            i++;
//          System.out.println(VP.get(i));
            if(init1())
            {
              
//                i++;
                return true;
                
            }
        }
        else if(CP.get(i).equals("_"))
        {
            return true;
        }
        else if(CP.get(i).equals(";"))
        {
//            System.out.println(CP.get(i));
            return true;
        }
        
        
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean init1()
{
    if(CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
            CP.get(i).equals("INCDEC")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")
            ||CP.get(i).equals("String Constant")||CP.get(i).equals("(")||CP.get(i).equals("NOT")||CP.get(i).equals("{"))
    {
    if(CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
            CP.get(i).equals("INCDEC")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")
            ||CP.get(i).equals("String Constant"))   
    {
    if(l())
    {
        if("".equals(t3)){
        if(!typec1.equals(t5)){
                         System.out.println(typec1+"->"+t5+" Type Mismatched error at line number:"+line.get(i));
                         t5="";
        
        }
        }
       
        else{
            if(!typec1.equals(t4)){
                         System.out.println(typec1+"->"+t4+" Type Mismatched error at line number:"+line.get(i));
                         t4="";
            }
            
        }
       

        if(CP.get(i).equals("]")){ //jugar for ; lekin ] ajae
            i++;
        }
        if(CP.get(i).equals(")")){ //jugar for ; lekin ] ajae
            i++;
        }
      
        if(list())
        {
            return true;
        }
        
        
    }
    }   
    else if(CP.get(i).equals("ID"))
    {  
        //first looup of current ID in table then check compatiblity
        String result3="no";
        
        
      
        String check=VP.get(i); 
          String scopecheck="";
          scopecheck=scopecheck+scope;
          
          //LOOKUP
                for(int d=0;d<did;d++){
           if ((lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[4].equals(scopecheck))||(lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[4].equals("0"))
          ||(lookupdecl.get(d)[2].equals(check)&&lookupdecl.get(d)[0].equals("open")||lookupdecl.get(d)[0].equals("shelter"))){
                                                typec2=lookupdecl.get(d)[1];
                                           
                                            result3="yes";
                                            break;
                                            }
                                           }
                                            
                                            //IF IN TABLE THEN CHECKING COMPATIBLITY
                                            if("yes".equals(result3)){
                                                if(!typec1.equals(typec2)){
                                                    System.out.println(typec1+"->"+typec2+" Type Mismatched error at line number:"+line.get(i));
                                                
                                                }
//                                                else{
//                                                    System.out.println("Type matched");
//                                                }
                                            }
                                            
                                            //IF NOT IN TABLE THEN NOT FOUND ERROR
                                            if("no".equals(result3)){
                                                  System.out.println(VP.get(i)+" is not defined or cannot find symbol at line number:"+line.get(i));
                                            }
        

        
            i++;
            
            
            if(init())
            {
//                i++; //filhal } ye araha tha to isko comment krdia

                if(list())
                {
//                     System.out.println(VP.get(i));
                    return true;
                }
            }
    }
    else if(CP.get(i).equals("{"))
    {
       
        if(a1())
        {
            i++;
      
            return true;
        }
    }
    else if(CP.get(i).equals("(")||CP.get(i).equals("NOT"))
    {
        return true;
    }
    
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean a1()
{
    if(CP.get(i).equals("{"))
    {
       i++;
      
          if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")
            ||CP.get(i).equals("String Constant"))
          {
              //checking for int a[]={2|3|4}
              count++;
              String check=CP.get(i);
              if(!("integer".equals(typec1))&& ("Integer Constant".equals(check))){
              
                  System.out.println(typec1+"->"+check+" Type Not Matched at line number:"+line.get(i));
              }
               if(!"flt".equals(typec1)&& "Floating Constant".equals(check)){
              
                  System.out.println(typec1+"->"+check+" Type Not Matched at line number:"+line.get(i));
              }
               if(!"chr".equals(typec1)&& "Character Constant".equals(check)){
              
                  System.out.println(typec1+"->"+check+" Type Not Matched at line number:"+line.get(i));
              }
               if(!"str".equals(typec1)&& "String Constant".equals(check)){
              
                 System.out.println(typec1+"->"+check+" Type Not Matched at line number:"+line.get(i));
              }
               
               
              
              i++;
             if(B())
              {

                 if(CP.get(i).equals("}"))
                 {

                     return true;
                 }
              }
          }
      
           
           
          if(CP.get(i).equals("}"))
          {
              return true;
          }
       
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean list()
{
    String[]  enteries2=new String[5];
    if(CP.get(i).equals("_")||CP.get(i).equals(";"))
    {
        if(CP.get(i).equals("_"))
        {
            i++;
          //  System.out.println("eoipe"+CP.get(i));
            if(CP.get(i).equals("ID"))
            {  
                dname=VP.get(i);
                  //lookup
                        
//                         dtype+=dtype2;// 
                                        enteries2[0]=dam; 
                                        enteries2[1]=dtype;
                                        enteries2[2]=dname;
                                        enteries2[3]=dsize;
                                        enteries2[4]=dscope+scope;

                                        

                                        for(int d=0;d<did;d++){
                                        if ((lookupdecl.get(d)[2].equals(enteries2[2]))&&(lookupdecl.get(d)[4].equals(enteries2[4]))){
                                            System.out.println("variable redeclearation error at line number:"+line.get(i));
                                            result2="yes";
                                            break;
                                            }
                                            }

        
                                          if(!"yes".equals(result2)){
                                          lookupdecl.put(did,enteries2);
                                             did++;
                                           System.out.println("Inserted declaration");
                                           }
                                          
                                          
                                                   
               
                                         for(int c=0;c<did;c++){
                                                System.out.println("Table->"+Arrays.toString(lookupdecl.get(c)));
                                                    }
//                                      after inserting values make all values to default
//                                                dam="-"; 
//                                                dtype="";
                                                 dtype2="";
                                                 dname="";
                                                 dsize="-";
                                                 result2="";
//                                                 dscope="";

                        
                        
                        
                        //lookup
                      
                
                i++;
                
                if(init())
                {
                 
                 if(list())
                 {
                     return true;
                 }
                }
            }
            
        }
        else if(CP.get(i).equals(";"))
        {
//            System.out.println(CP.get(i)+"asdsda");
            return true;
        }
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}


public static boolean B()
{
    if(CP.get(i).equals("|")||CP.get(i).equals("}"))
    {
   
        if(CP.get(i).equals("|"))
        {
        i++;
        
         if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")
            ||CP.get(i).equals("String Constant"))
         {
             count++;
              String check=CP.get(i);
              if(!"integer".equals(typec1)&& "Integer Constant".equals(check)){
              
               System.out.println(typec1+"->"+check+" Type Not Matched at line number:"+line.get(i));
              }
               if(!"flt".equals(typec1)&& "Floating Constant".equals(check)){
              
                System.out.println(typec1+"->"+check+" Type Not Matched at line number:"+line.get(i));
              }
               if(!"chr".equals(typec1)&& "Character Constant".equals(check)){
              
                  System.out.println(typec1+"->"+check+" Type Not Matched at line number:"+line.get(i));
              }
               if(!"str".equals(typec1)&& "String Constant".equals(check)){
              System.out.println(typec1+"->"+check+" Type Not Matched at line number:"+line.get(i));
              }
                
             i++;
              
                  if(B())
                  {
                      return true;
                  }
              
            
         }
        }
        else if(CP.get(i).equals("}"))
            
        {
            
            //now comparing size of array and the number of elements assign
            size_c2+=count;

            if(!size_c.equals(size_c2)){
            System.out.println(dtype+size_c+"->"+size_c2+"   Array Size Error out of bound!! at line"+line.get(i));
            }
            count=-1;
            size_c2="";
           
            return true;
        }
        
    }
//System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}



//lock loop
public static boolean lock()
{
    String check=Glabel();
    System.out.println(ANSI_RED+check+ANSI_RESET);
    
    if(CP.get(i).equals("lock"))
    {
       
        i++;
       
         if(CP.get(i).equals("("))
         {
             i++;
           
             if(x())
             {

                 if(y())
                 {  
                      System.out.println(ANSI_RED+"if("+Gtemp2()+"==false)"+ANSI_RESET);//icg
                      String check2=Glabel();
                      String check3=check2.substring(0,check2.length()-1);
                       System.out.println(ANSI_RED+"JMP "+check3+ANSI_RESET);//icg
                      
//                     i++;
                     
        
                  
                     if(CP.get(i).equals(";"))
                     {
                         i++;
                        
                         if(z())
                         {
//                             i++;
                        
                             if(CP.get(i).equals(")"))
                             {
                                 i++;
                              
                                 if(body())
                                 {
                                check=check.substring(0,check.length()-1);
                                System.out.println(ANSI_RED+"JMP "+check+ANSI_RESET);
                                System.out.println(ANSI_RED+check2+ANSI_RESET);
                                     
                                     System.out.println("Lock parsed");
                                    
                                    return true;
                                }
                                 }
                             
                         }
                     }
                 }
             }
         }
        
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
return false;
}
public static boolean x()
{
    if(CP.get(i).equals("AM")||CP.get(i).equals("DT")||CP.get(i).equals("ID")||CP.get(i).equals(";"))
    {
        if(CP.get(i).equals("AM")||CP.get(i).equals("DT"))
        {
           
            if(decl())
            {
                i++;
                return true;
            }
        }
         if(CP.get(i).equals("ID"))
         {
            
             if(assign())
             {
                 i++;
                 return true;
             }
         }
         else if(CP.get(i).equals(";")){
             i++;
         return true;
         }
        
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}

public static boolean y()
{
    if(CP.get(i).equals("INCDEC")||CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")|| CP.get(i).equals(";"))
    {
        if(CP.get(i).equals("INCDEC")||CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant")){
            
        if(l()){
            
        
            return true;
        }
        
        
    }
        else if(CP.get(i).equals(";")){
        
        return true;
        }
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}

public static boolean z()
{
    if(CP.get(i).equals("INCDEC")||CP.get(i).equals("(")||CP.get(i).equals("ID")||CP.get(i).equals("Integer Constant")||
               CP.get(i).equals("Floating Constant")|| CP.get(i).equals("Character Constant")|| CP.get(i).equals("String Constant"))
    {
        if(l()){
        
        return true;
        }
    }

    return false;
}
//for
public static boolean if1()
{
if(CP.get(i).equals("if"))
{
     
    i++;
    if(CP.get(i).equals("("))
    {
//        System.out.println("hello"+CP.get(i));
        i++;
        if(l())
        {
            
            i++;
            if(CP.get(i).equals(")"))
            {
                 
                i++;
                 System.out.println("SDA"+CP.get(i));
                if(body())
                {
                     
                    i++;
                    
                  if(f2())
                  {
                   
                      
                  if(CP.get(i).equals("$"))
                  {
                     i++;
                      return true;
                    }
                  }
                }
            }
        }
    }
    
}    
//     System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    
}

public static boolean f2()
{
    
    
        if(CP.get(i).equals("elseif")||CP.get(i).equals("else")||CP.get(i).equals("$"))
        {
            if(CP.get(i).equals("elseif")||CP.get(i).equals("else")){
              if(else_if())
                    {
                        
                        if(else1())
                        {
                              i++;
                              
                            return true;
                  
                    }
              
        }
            }
            else if(CP.get(i).equals("$"))
            {
                
              return true;  
            }
        
        }
//System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
 return false;   
}

public static boolean else_if()
{
    if(CP.get(i).equals("elseif")||CP.get(i).equals("else")||CP.get(i).equals("$"))
    {
       if(CP.get(i).equals("elseif"))
       {
           
           i++;
           if(CP.get(i).equals("("))
           {
                
               i++;
                 
               if(l())
               {
                 
                   i++;
                  
                    if(CP.get(i).equals(")"))
                    {
                      
                        i++;
                        
                        if(body())
                        {
                           
                            i++;
                            if(CP.get(i).equals("$"))
                            {
                                i++;
                            if(else_if())
                            {
                              
                            return true;
                            }
                        }
                    }
               }
               }
           }
       }
       
      else if(CP.get(i).equals("else"))
       {
          return true; 
       }
       else if(CP.get(i).equals("$"))
       {
           
          return true; 
       }
       
  
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
  return false;
}
public static boolean else1()
{
   if(CP.get(i).equals("else")||CP.get(i).equals("$"))
   {
        
       if(CP.get(i).equals("else")){
           i++;
       if(body())
       {
           return true;
       }
       }
       
       else if(CP.get(i).equals("$"))
       {
           
          return true; 
       } 
       
   }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
 return false;   
}

//strc_initliaze
public static boolean struct_init(){
    
    String enteries5[]=new String[3];
    if(CP.get(i).equals("strc")){
        
        if(CP.get(i).equals("strc")){
            i++;
            if(CP.get(i).equals("ID")){
                //will lookup here whether structure of this ID is initialize or not
                sl2Stname=VP.get(i);//getting struncture name here


                
                                      for(int d=0;d<sid;d++){
                                        if ((lookupstrc.get(d)[0].equals(sl2Stname))){
                                           result7="yes";
                                               break;
                                            }
                                            }
                                         if("no".equals(result7)){
                                          System.out.println("Structure->"+sl2Stname+" is not found error!! at line: "+line.get(i));
                                            }
                    
                                          i++;
                if(CP.get(i).equals("ID")){ 
                    //now inserting instances of structure after lookup
                    sl2name=VP.get(i);
                                      if("yes".equals(result7)){
                                       enteries5[0]= sl2Stname; 
                                        enteries5[1]=sl2name;
                                        enteries5[2]=sl2scope+scope;
                                        

                                        for(int d=0;d<slink2id;d++){
                                        if ((lookupstrclink2.get(d)[0].equals(enteries5[0]))&&(lookupstrclink2.get(d)[1].equals(enteries5[1]))){
                                            System.out.println("Structure instance redecleration error at line number"+line.get(i));
                                            result6="yes";
                                            break;
                                            }
                                            }

        
                                          if(!"yes".equals(result6)){
                                          lookupstrclink2.put(slink2id,enteries5);
                                            slink2id++;
                                           System.out.println("Structure Instance Inserted");
                                           }
                                          
                                          
                                                   
               
                                         for(int c=0;c<slink2id;c++){
                                                System.out.println("Table Strc Instance->"+Arrays.toString(lookupstrclink2.get(c)));
                                                    }

                                                
                                               sl2name="";
                                                 
                                                 result6="";
                        
                            
                                     }
                    i++;
                    
                    
                    if(Z()){
//                        System.out.println("= ye ana chai"+VP.get(i));
                        if(X()){
//                             System.out.println("} need"+CP.get(i));
                            if(CP.get(i).equals("}")){
                                i++;
                            }
                             if(CP.get(i).equals(";")){
                                   System.out.println("Parsed struct init");
                            return true;
                            
                            }
                        
                        }
                    
                    }
                
                }
            
            
            
            }
            
        }
        }
        
    
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean X(){
    if(VP.get(i).equals("=")||VP.get(i).equals(";")){
    if(VP.get(i).equals("=")){
        
        if(VP.get(i).equals("=")){
           
        i++;
        if(CP.get(i).equals("{")){
            i++;
//            System.out.println("jkjh"+CP.get(i));
            if(Y()){
                
                
                if(CP.get(i).equals("}")){
                
                    return true;
                
                }
            
            }
        
        }
        
        }
    
    }
        
    
    else if(CP.get(i).equals(";")){
        
    return true;    
        
    }
    }
    
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    public static boolean Y(){
    if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")||
            CP.get(i).equals("String Constant")||CP.get(i).equals("{")||CP.get(i).equals("}")){
        
    if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")||
            CP.get(i).equals("String Constant")){
             if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")||
            CP.get(i).equals("String Constant")){
                 if(cons_init()){
                
                  
//                   System.out.println("_ yneed"+CP.get(i));
                 if(D()){
//                 System.out.println("} ye ana chai"+CP.get(i));
                 return true;
                 }
                }
             
                }
             }
    
    else  if(CP.get(i).equals("{")){
        if(CP.get(i).equals("{")){
//            System.out.println("sdasd"+CP.get(i));
            i++;
            if(cons_init()){
                
                i++;
                if(D()){
                    i++;
                    if(CP.get(i).equals("}")){
                        
                    
                    return true;
                    }
                
                }
            
            }
        
        }
    
    }
    
        else if(CP.get(i).equals("}")){
    
        return true;
    
    }
    
    
    
    
    }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
        return false;
    }
    
    public static boolean D(){
         if(CP.get(i).equals("_")||CP.get(i).equals("}")){
             
             if(CP.get(i).equals("_")){
             
             if(CP.get(i).equals("_")){
                  
                 i++;
                 
                 
                 if(f1()){
//                     System.out.println("asad"+CP.get(i));
                     return true;
                 }
             
             }
             
             }
             else if(CP.get(i).equals("}")){
                 
               return true;
             }
             
             }
//         System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
             return false;
         }
    

    public static boolean f1(){
            
        if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")||
            CP.get(i).equals("String Constant")||CP.get(i).equals("{")||CP.get(i).equals("}")){
                    
             if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")||
            CP.get(i).equals("String Constant")){
                 if(cons_init()){
                     
                     if(D()){
                     
                     return true;
                     }
                 }
             
             }
             else if(CP.get(i).equals("{")){
                 
                 i++;
                 System.out.println("Hello"+VP.get(i));
                 if(cons_init()){
//                 System.out.println("Helloyp"+CP.get(i));
                     if(D()){
                     
                         if(CP.get(i).equals("}")){
                         
                             i++;
                             if(D()){
                             
                             return true;
                             }
                         }
                     }
                 }
             
             }
             else if(CP.get(i).equals("}")){
                 if(CP.get(i).equals("}")){
                 
                 i--;
                 if(CP.get(i).equals(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")||
                    CP.get(i).equals("String Constant"))){
                 
                            return true;
                 }
  
             }
             }
//             return false;
        
        }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    public static boolean Z(){
        
     String enteries5[]=new String[3];
       if(CP.get(i).equals("_")||VP.get(i).equals("=")||CP.get(i).equals(";")){
           
           if(CP.get(i).equals("_")){
               if(CP.get(i).equals("_")){

               i++;
               
               if(CP.get(i).equals("ID")){
                            sl2name=VP.get(i);
                                      if("yes".equals(result7)){
                                       enteries5[0]= sl2Stname; 
                                        enteries5[1]=sl2name;
                                        enteries5[2]=sl2scope+scope;
                                        

                                        for(int d=0;d<slink2id;d++){
                                        if ((lookupstrclink2.get(d)[0].equals(enteries5[0]))&&(lookupstrclink2.get(d)[1].equals(enteries5[1]))){
                                            System.out.println("Structure instance redecleration error at line number"+line.get(i));
                                            result6="yes";
                                            break;
                                            }
                                            }

        
                                          if(!"yes".equals(result6)){
                                          lookupstrclink2.put(slink2id,enteries5);
                                            slink2id++;
                                           System.out.println("Structure Instance Inserted");
                                           }
                                          
                                          
                                                   
               
                                         for(int c=0;c<slink2id;c++){
                                                System.out.println("Table Strc Instance->"+Arrays.toString(lookupstrclink2.get(c)));
                                                    }

                                                
                                               sl2name="";
                                      
                                      }
                        
                   i++;
                    
                   if(Z()){
                   
                   return true;
                   }
               
               
               }
               
               }
           
           
           }
           else if(CP.get(i).equals(";")){
               
              sl2Stname="";
              sl2scope="";
           return true;
           
           }
           else if(VP.get(i).equals("=")){
           
           return true;
           
           }
               
    }
//        System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    public static boolean cons_init(){
    if(CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")||
            CP.get(i).equals("String Constant")){
        i++;
        return true;
    }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
    }
    
    //switch
    public static boolean switch_st()
{
    icg4=Glabel3();
if(CP.get(i).equals("shift"))
{
//    System.out.println("Shift"+CP.get(i));
    i++;
    if(CP.get(i).equals("("))
        i++;
    if(l())
    {
        
       
//       System.out.println("abbas"+CP.get(i));
         if(CP.get(i).equals(")"))
         {
             i++;
             //jugar for expression as it is returning from first ) ) {
            if(CP.get(i).equals(")")){
                i++;
            }
            
             if(CP.get(i).equals("{"))
             {
                 st.push(scope++);
                 i++;
               
                 if(CP.get(i).equals("phase"))
                 {
                     String check=Glabel();
                       System.out.println(ANSI_RED+check+ANSI_RESET);
    
                     if(case1())
                     {
                     
                   
                     if(CP.get(i).equals("default"))
                     {
                          System.out.println(ANSI_RED+Glabel()+ANSI_RESET);
                     if(default1())
                     {
                     i++;
                     if(CP.get(i).equals(")")){//jugar ) ) }
                     i++;
                     }
               
                    if(CP.get(i).equals("}"))
                        scope=(int) st.pop();
//                    System.out.println("Scope------------------------------------------->"+scope);
                            {
                                System.out.println(ANSI_RED+icg4+ANSI_RESET);
                                System.out.println("Shift Parsed");
                                countlabel+=10;
                        return true;
           
                        }
                 }
                 }
                     
                 }
                 }
                 
             }
         }
    }
}
//System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
return false;
}

public static boolean case1()
{
    if(CP.get(i).equals("phase"))
    {
        i++;
//        System.out.println(CP.get(i));
        if((CP.get(i).equals("Integer Constant")||CP.get(i).equals("Floating Constant")||CP.get(i).equals("Character Constant")||
            CP.get(i).equals("String Constant")))
        {
            String checkk=VP.get(i);
           i++;
          if(CP.get(i).equals(":"))
             {
                 System.out.println(ANSI_RED+Glabel()+ANSI_RESET);
                 i++;
                 String check2=Gtemp();
                 System.out.println(ANSI_RED+check2+"="+checkk+ANSI_RESET);
                 System.out.println(ANSI_RED+"if("+Gtemp2()+"==false)"+ANSI_RESET);
                 String test=Glabel2();
                 String test2=test.substring(0,test.length()-1);
                 System.out.println(ANSI_RED+"JMP "+test2+ANSI_RESET);
                 
                 
                 String check4=icg4.substring(0,icg4.length()-1);
                  System.out.println(ANSI_RED+"JMP "+check4+ANSI_RESET);
                if(body())
                 {
                     i++;
//                     System.out.println("sasa"+CP.get(i));
                     
                      if(c11())
                     {  
                        
                         System.out.println("Phase Parsed");
                        return true;
                     }
                 }
             }
        }
            }
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean c11()
{
      if(CP.get(i).equals("phase")||CP.get(i).equals("default"))
      {
          if(CP.get(i).equals("phase"))
          {
              if(case1())
              {
                  return true;
              }
          }
           if(CP.get(i).equals("default"))
           {
            return true;  
           }
      }
    
//    System.out.println("Error at line number"+line+"CP is"+CP.get(i)+"VP is:"+VP.get(i));
    return false;
}
public static boolean default1()
{
 if(CP.get(i).equals("default"))
 {
  i++;
 
  if(CP.get(i).equals(":"))
  {
      i++;
      
      if(body())
      {
//          if(CP.get(i).equals(")")){
//              i++;
//          }
                    
                
                 String check4=icg4.substring(0,icg4.length()-1);
                  System.out.println(ANSI_RED+"JMP "+check4+ANSI_RESET);
          
          
          
          
          
          System.out.println("default Parsed");
          return true;
      }
  }
 }

    return false;
}

}


