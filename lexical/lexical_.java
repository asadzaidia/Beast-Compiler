/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  floatingpoint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asad_Zaidi
 */
public class FloatingPoint {

   public static int line=1;
  
 public static String temp="";
 public static String temp2="";
  public static String temp3="";
   public static String temp4="";
      public static String temp5="";
       public static String temp6="";
       public static String temp7="";
       public static String check="";
      public static  String val1="";
      public static String val2="";
       public static String val3="";
        public static String check2="";
      
    public static void main(String[] args) throws FileNotFoundException {
     
 
 String[] KW={"main","outcome","income","end"};
 String[] whil={"while"};
 String[] retu={"return"};
 String[] retures={"true","false"};
 String[] brea={"break"};
 String[] conti={"continue"};
 String[] shift={"shift"};
 String[] phase={"phase"};
 String[] defaults={"default"};
 
 String[] iff={"if"};
 String[] elseif={"elseif"};
 String[] elsee={"else"};
 String[] voi={"void"};
// String[] def={"def"};
 String[] main={"main"};
 String[] doo={"do"};
 String[] until={"until"};
  String[] start={"start"};
  String[] lock={"lock"};
  String[] ret={"return"};
 String[] D={"$"};
 String[] EOF={"$"};
 String[] di={"_"};
 String[] SBO={"("};
 String[] SBC={")"};
 String[] SCO={"{"};
 String[] proto={"#"};
 String[] SCC={"}"};
 String[] SLO={"["};
 String[] SLC={"]"};
  String[] colan={":"};
 String[] E={";"};
 String[] acc={"@"};
  String[] sep={"|"};
 String[] Sp={" "};
 String[] NL={"nl"};
 String[] DT={"integer","flt","chr","str"};
 String[] INCDEC={"INC","DEC"};
 String[] AM={"open","shield","shelter"};
 String[] St={"strc"};
 String[] Assignment={"equals","PE","ME","DE","MODE"};
 String[] TM={"fixed","final"};
    String[] eq={"="};
 String[] ADDSUM={"+","-"};
  String[] call={"call"};
 //String[] OR={"AUR"};
 String[] ANDOR={"AND","AUR"};
 String[] NOT={"NOT"};
 String[] RO={"Lequals","Gequals","Nequals"};
 String[] Gt={">"};
 String[] Lt={"<"};
 String[] MUL={"*"};
 String[] DIVMOD={"/","%"};
 String[] SST={":"};
 

 String theString = "";

FileInputStream file = new FileInputStream("input.txt");
FileOutputStream out = new FileOutputStream("output.txt");
Scanner scanner = new Scanner(file);

PrintWriter bw = new PrintWriter(out);

theString = scanner.nextLine();
while (scanner.hasNextLine()) {
       theString = theString +"\n"+ scanner.nextLine();
       
}

   char[] array1=theString.toCharArray();
//   for(int k=0;k<array1.length;k++){
//   System.out.println(array1[k]);
//   
//    }
   int num=array1.length;
   System.out.println(num);
 
   int i=0, j = 0;
   
   
                   while(i<=num && j<=num){
                              
                   
                   while((array1[i]!=' ' && array1[i]!='#' && array1[i]!='(' && array1[i]!='.' && array1[i]!='\'' && array1[i]!=')' && array1[i]!=',' && array1[i]!='{' && array1[i]!='}'
                           && array1[i]!=';'  && array1[i]!='~'  &&array1[i]!='+' &&array1[i]!='-' &&array1[i]!='_'  &&array1[i]!='/'
                            &&array1[i]!='@'  &&array1[i]!='%' &&array1[i]!='>' &&array1[i]!='<' &&array1[i]!='[' &&array1[i]!='='
                           &&array1[i]!=']' &&array1[i]!='*' &&array1[i]!=':' &&array1[i]!='|' &&i<=num )){
                
                    
                    temp+=array1[i];
                    temp6+=array1[i];
                    temp7+=array1[i];
                    
                           
                     
                     i++;
                     j++;
                     
                     }
                    temp2+=array1[j];
                    val2+=array1[j];
                
                temp=temp.trim();
                //System.out.println(temp+"tasdfa");
                temp6=temp6.trim();
                temp7=temp7.trim();
               
                //character

                    if("'".equals(temp2))
                    {
                        
                        
                        temp3+=val1+temp+temp2;
                        
                    
                    
                    
                    
                    
                    System.out.println(temp3+"check");
                  
                    if(temp3.matches("^'")){
                        
                        System.out.println("Pattern");
                        temp="";
                        temp2="";
                        temp7="";
                        
                      
                    
                    }
                    
                    else if(temp3.matches("^'[A-Za-z0-9\\W]*'")){
                        
                          
                          
                          

                                    val1=temp3.substring(temp3.length()-1);
                                    //System.out.println("value1:"+val1);
                                    
                                    //check=temp3.substring(0,temp3.length()-1);
                                    
                                    
                                     if(temp3.matches("^'[A-Za-z0-9\\W]'") || temp3.matches("^'[('\\\\')][A-Za-z]'")){
                                        bw.println(temp3+","+"Character Constant"+","+line);
                                        bw.flush();
                                        System.out.println("["+temp3+" "+","+"Character Constant"+" "+","+line+"]");
                                        System.out.println("yes");
                                        temp3="";
                                        
                                        temp6="";
                                        val1="";
                                        temp7="";
                                        
                                    
                                    }
                                   else  if(temp3.matches("^'[A-Za-z0-9\\W]*'")){
                                       String yo=temp3.substring(0,3);
                                   check2=temp3.substring(3);
                                   System.out.println("check2"+check2);
                                       if(yo.matches("^'[A-Za-z0-9\\W]'") ||yo.matches("^'[('\\\\')][A-Za-z]'")){
                                            bw.println(yo+","+"Character Constant"+","+line);
                                        bw.flush();
                                        System.out.println("["+yo+" "+","+"Character Constant"+" "+","+line+"]");
                                        System.out.println("yes");
                                        temp3="";
                                        
                                        temp6="";
                                        val1="";
                                        temp7="";
                                       
                                       }
                                       
                                      else{
                                                bw.println(yo+" invalid Constant at"+line);
                                        bw.flush();
                                        System.out.println(yo+" invalid Constant at"+line);
                                        System.out.println("id");
                                        temp3=""; 
                                        
                                        temp6="";        
                                        temp7="";
                                        
                                       
                                       
                                       }
                                        
                                    }
                                     




                    
                    }   
                    
                    
                                   
                    else{
                        
                        temp="";
                        temp2="";
                        val3="";
                        
                    }
                 
                    }
                                    
                              
                    
//                    check2=check2.substring(0,check2.length()-1);
                    
                    if(check2.matches("[a-zA-Z][a-zA-Z0-9_]*(\\')")){
                                       check2=check2.substring(0,check2.length()-1);
                                            bw.println(check2+","+"Identifier"+","+line);
                                        bw.flush();
                                        System.out.println("["+check2+" "+","+"Identifier"+" "+","+line+"]");
                                        System.out.println("id");
                                        temp3=""; 
                                        
                                        temp6="";        
                                        temp7="";
                                       
                                       
                                       }
                    
                    

//                
                //floating
                
                    if(".".equals(temp2))
                    {
                       
                        temp3+=val3+temp+temp2;
                        System.out.println(temp3);
                    
                    if(temp3.matches("[-+]?[0-9]*[(\\.)]")){
                        System.out.println(temp3+"pattern");
                        temp="";
                        temp2="";
                        temp7="";
                        val2="";
                        
                      
                    
                    }
                    
                    else if(temp3.matches("[-+]?[0-9]*[(\\.)][a-zA-Z0-9]+[(\\.)]")){
                                    val3=temp3.substring(temp3.length()-1);
                                    check=temp3.substring(0,temp3.length()-1);
                                     if(check.matches("(-+)?[0-9]+")){
                                        bw.println(check+","+"Integer Constant"+","+line);
                                        bw.flush();
                                        System.out.println(check+","+"Integer Constant"+","+line);
                                        System.out.println("yes");
                                        temp3=""; 
                                        check="";
                                        val3="";
                                        val2="";
                                    }
                                     else  if(check.matches("[-+]?[0-9]*[(\\.)][0-9]+")){
                                        bw.println(check+","+"Floating Constant"+","+line);
                                        bw.flush();
                                        System.out.println("["+check+" "+","+"Floating Constant"+" "+","+line+"]");
                                        System.out.println("yes");
                                        temp3=""; 
                                        check="";
                                        temp6="";        
                                        temp7="";
                                        val2="";
                                    }
                                   else if(temp3.matches("[-+]?([0-9]*\\.[0-9]+|[0-9]+)")){
                                   
                                   bw.println(check+","+"Floating Constant"+","+line);
                                        bw.flush();
                                        System.out.println("["+check+" "+","+"Floating Constant"+" "+","+line+"]");
                                        System.out.println("yes");
                                        temp3=""; 
                                        temp6="";
                                       temp7="";
                                        val2="";
                                   }
                                   
                                    else{
                                        bw.println(check+","+"Invalid"+","+line);
                                        bw.flush();
                                        System.out.println("["+check+" "+","+"Invalid"+" "+","+line+"]");
                                        System.out.println("No");
                                         temp3="";
                                         check="";
                                         temp6="";
                                         temp7="";
                                         val2="";
                                    }
                                        
                    
                    }  
                    
//                    //testing
//                    else if(temp3.matches("[-+]?[0-9]*[(\\.)][a-zA-Z0-9]+[(\\W)]")){
//                                    val3=temp3.substring(temp3.length()-1);
//                                    //System.out.println("value1:"+val1);
//                                    
//                                    check=temp3.substring(0,temp3.length()-1);
//                                     if(check.matches("(-+)?[0-9]+")){
//                                        bw.println(check+","+"Integer Constant"+","+line);
//                                        bw.flush();
//                                        System.out.println(check+","+"Integer Constant"+","+line);
//                                        System.out.println("yes");
//                                        temp3=""; 
//                                        check="";
//                                        val3="";
//                                    }
//                                     
//                                     else  if(check.matches("[-+]?[0-9]*[(\\.)][0-9]+")){
//                                    
//                                        bw.println(check+","+"Floating Constant"+","+line);
//                                        bw.flush();
//                                        System.out.println("["+check+" "+","+"Floating Constant"+" "+","+line+"]");
//                                        System.out.println("yes");
//                                        temp3=""; 
//                                        check="";
//                                        temp6="";        
//                                        temp7="";
//                                        
//                                    }
//                                   else if(temp3.matches("[-+]?([0-9]*\\.[0-9]+|[0-9]+)")){
//                                   
//                                   bw.println(check+","+"Floating Constant"+","+line);
//                                        bw.flush();
//                                        System.out.println("["+check+" "+","+"Floating Constant"+" "+","+line+"]");
//                                        System.out.println("yes");
//                                        temp3=""; 
//                                        temp6="";
//                                       temp7="";
//                                        
//                                   }
//                                   
//                                    else{
//                                        bw.println(check+","+"Invalid"+","+line);
//                                        bw.flush();
//                                        System.out.println("["+check+" "+","+"Invalid"+" "+","+line+"]");
//                                        System.out.println("No");
//                                         temp3="";
//                                         check="";
//                                         temp6="";
//                                         temp7="";
//                                         
//                                    }
//                                        
//                    
//                    }   
//                    
                    
                    
                                   
                    else{
                        
                        temp="";
                        temp2="";
                        val3="";
                        
                    }
                 
                    }
                                    
                              
                      
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
     
                
                //Keywords
            if(Arrays.asList(KW).contains(temp6)){
            bw.println(temp6+","+"KW"+","+line);
            bw.flush();
               System.out.println("["+temp6+" "+","+"KW"+" "+","+line+"]");
             
                
                
            }
            
            
//
//          if(!Arrays.asList(KW).contains(temp)){
//                
//            temp2=temp2+temp;
//            System.out.println(temp2);
//            }
            
           
              
            
            //Space
            
          if(Arrays.asList(Sp).contains(temp2)){
               val1=val1.trim();
                val3="";
             
                
            }
          
          //New LIne
          
           if(Arrays.asList(NL).contains(temp)){
               System.out.println("Yoyo");
                line++;
                val3="";
            }
           
           //DATA TYPES
           if(Arrays.asList(DT).contains(temp6)){
                bw.println(temp6+","+"DT"+","+line);
              bw.flush();
               
                System.out.println("["+temp6+" "+","+"DT"+" "+","+line+"]");
                val3="";
            }
           //INCDEC
            if(Arrays.asList(INCDEC).contains(temp6)){
                bw.println(temp6+","+"INCDEC"+","+line);
                 bw.flush();
                System.out.println("["+temp6+" "+","+"INCDEC"+" "+","+line+"]");
                
            }
             //true ya false
            if(Arrays.asList(retures).contains(temp6)){
                bw.println(temp6+","+"T/F"+","+line);
                 bw.flush();
                System.out.println("["+temp6+" "+","+"T/F"+" "+","+line+"]");
                
            }
//              //return
//            if(Arrays.asList(retu).contains(temp6)){
//                bw.println(temp6+","+"return"+","+line);
//                 bw.flush();
//                System.out.println("["+temp6+" "+","+"return"+" "+","+line+"]");
//                
//            }
            //Access Modifier
          if(Arrays.asList(AM).contains(temp6)){
               bw.println(temp6+","+"AM"+","+line);
               bw.flush();
                System.out.println("["+temp6+" "+","+"AM"+" "+","+line+"]");
                
            }
            //SST
          if(Arrays.asList(SST).contains(temp6)){
               bw.println(temp6+","+"-"+","+line);
                bw.flush();
                System.out.println("["+temp6+" "+","+"-"+" "+","+line+"]");
                
            }
           //Identifier
                     if(temp6.matches("[a-zA-Z][a-zA-Z0-9_]*") && !Arrays.asList(DT).contains(temp6) && !Arrays.asList(KW).contains(temp6)&& 
                             !Arrays.asList(AM).contains(temp6)&& !Arrays.asList(St).contains(temp6)&& !Arrays.asList(RO).contains(temp6)
                             && !Arrays.asList(NOT).contains(temp6)&& !Arrays.asList(ANDOR).contains(temp6)
                             && !Arrays.asList(Assignment).contains(temp6)
                             && !Arrays.asList(whil).contains(temp6)
                             && !Arrays.asList(until).contains(temp6)
                             && !Arrays.asList(brea).contains(temp6)
                             && !Arrays.asList(conti).contains(temp6)
                             && !Arrays.asList(shift).contains(temp6)
                             && !Arrays.asList(elseif).contains(temp6)
                              && !Arrays.asList(elsee).contains(temp6)
                             && !Arrays.asList(voi).contains(temp6)
                             && !Arrays.asList(lock).contains(temp6)
                             && !Arrays.asList(main).contains(temp6)
                             && !Arrays.asList(doo).contains(temp6)
                             && !Arrays.asList(ret).contains(temp6)
                             && !Arrays.asList(SST).contains(temp6)
                             && !(Arrays.asList(INCDEC).contains(temp6))
                             && !Arrays.asList(NL).contains(temp6)
                         //    && !Arrays.asList(OR).contains(temp6)
                             && !Arrays.asList(TM).contains(temp6)
                             && !Arrays.asList(start).contains(temp6)
                             &&!Arrays.asList(MUL).contains(temp6)
                             &&!Arrays.asList(call).contains(temp6)
                               &&!Arrays.asList(retu).contains(temp6)
                                &&!Arrays.asList(retures).contains(temp6)
                                 &&!Arrays.asList(iff).contains(temp6)
                             &&!Arrays.asList(phase).contains(temp6)
                             &&!Arrays.asList(defaults).contains(temp6)
//                             &&!Arrays.asList(def).contains(temp6)
//                      && !temp3.matches("[-+]?[0-9]*[(\\.)][a-zA-Z]+")
//                             && !temp.matches("[-+]?[0-9]*[(\\.)][a-zA-Z]+")
//                              && !temp.matches("[a-zA-Z]+")
//                              && !temp3.matches("[a-zA-Z]+")
                             
                             && !Arrays.asList(D).contains(temp6)){
                                 val3="";
                          bw.println(temp6+","+"ID"+","+line);
                         bw.flush();
                System.out.println("["+temp6+" "+","+"ID"+" "+","+line+"]");
                                
               
                  }
          
          
         
                         
                     
                     
                   //integer Constant  
                    if(temp7.matches("(-+)?[0-9]+")){
                         bw.println(temp7+","+"Integer Constant"+","+line);
                         bw.flush();
                         System.out.println("["+temp7+" "+","+"Integer Constant"+" "+","+line+"]");
                         System.out.println("helasoas");
                      
                         val3="";
                    }
   if(Arrays.asList(D).contains(val2))
            {
                if(val2==" "){
                   val3="";
                }
                if(val2=="~"){
                   val3="";
                }
                
                if(val2=="$"){
                     bw.println("["+val2+" "+","+"EOF"+" "+","+line+"]");
                 
                bw.flush();    
                System.out.println("["+val2+" "+","+"EOF"+" "+","+line+"]");
                }
                
                else{
                    bw.println(val2+","+"-"+","+line);
                 
                bw.flush();    
              System.out.println("["+val2+" "+","+"-"+" "+","+line+"]");
              
         //  val3="";
            }
            }
            
                    
                    //String constant
                    
                    
                    if(temp6.matches("\".*\"")){
                        bw.println(temp6+","+"String Constant"+","+line);
                         bw.flush();
                         System.out.println("["+temp6+" "+","+"String Constant"+" "+","+line+"]");
                      
                    }
                    
                         //Multi line comments
                         
                          if(temp6.matches("^![A-Za-z0-9\\S+\\W]*!"))
                          {
                            //System.out.println("["+temp +" "+","+"String Constant"+" "+","+line+"]");
                              
                         
                              temp6="";
                      
                         
                            }
                    //Single line comments
                         
                          if(temp6.matches("^!![a-zA-Z0-9\\S+\\W]*(nl)"))
                          {
                            //System.out.println("["+temp +" "+","+"String Constant"+" "+","+line+"]");
                         
                              temp6="";
                      
                         
                            }
                  
                 
                  //floating constant
                    
                 /**   if(temp3.matches("[-+]?([0-9]*\\.[0-9]+|[0-9]+)")&&!(temp3.matches("(-+)?[0-9]+"))){
                        bw.println("["+temp3 +" "+","+"Floating Constant"+" "+","+line+"]");
                         bw.flush();
                        System.out.println("["+temp3 +" "+","+"Floating Constant"+" "+","+line+"]");
                     
                    }**/
                    
                    
                    
                    //Character constant
                    
                    if(temp6.matches("^'[A-Za-z0-9\\W]'")){
                        bw.println(temp6+","+"Character Constant"+","+line);
                        bw.flush(); 
                        System.out.println("["+temp6+" "+","+"Character Constant"+" "+","+line+"]");
                      
                    }
                    
                    
                    
                    
                    //Struncture
                     if(Arrays.asList(St).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"strc"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"strc"+" "+","+line+"]");
                
            }
//                           //Struncture
//                     if(Arrays.asList(def).contains(temp6)){
//                         
//                         
//                       bw.println(temp6+","+"def"+","+line);
//                        bw.flush();
//                       System.out.println("["+temp6+" "+","+"def"+" "+","+line+"]");
//                
//            }
                        //iff
                     if(Arrays.asList(iff).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"if"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"if"+" "+","+line+"]");
                
            }
                     
                        //EOF
                     if(Arrays.asList(EOF).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"$"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"$"+" "+","+line+"]");
                
                     }
                          //start
                     if(Arrays.asList(start).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"start"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"start"+" "+","+line+"]");
                
            }
                       
                     //while
                            if(Arrays.asList(whil).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"while"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"while"+" "+","+line+"]");
                
            }
                                //break
                            if(Arrays.asList(brea).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"break"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"break"+" "+","+line+"]");
                
            }
                                //continue
                            if(Arrays.asList(conti).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"continue"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"continue"+" "+","+line+"]");
                
            }
                            
                                //shift
                            if(Arrays.asList(shift).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"shift"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"shift"+" "+","+line+"]");
                
            }
                                   //phase
                            if(Arrays.asList(phase).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"phase"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"phase"+" "+","+line+"]");
                
            }
                            //default
                            if(Arrays.asList(defaults).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"default"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"default"+" "+","+line+"]");
                
            }
               
                                //if else
                            if(Arrays.asList(elseif).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"elseif"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"elseif"+" "+","+line+"]");
                
            }
                            //else
                            if(Arrays.asList(elsee).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"else"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"else"+" "+","+line+"]");
                }
                                            //lock
                            if(Arrays.asList(lock).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"lock"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"lock"+" "+","+line+"]");
                
            }
              
                                //void
                            if(Arrays.asList(voi).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"void"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"void"+" "+","+line+"]");
                
            }
                                // 
                            if(Arrays.asList(main).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"main"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"main"+" "+","+line+"]");
                
            }
                                //do
                            if(Arrays.asList(doo).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"do"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"do"+" "+","+line+"]");
                
            }
                                         //return
                            if(Arrays.asList(ret).contains(temp6)){
                         
                         
                       bw.println(temp6+","+"return"+","+line);
                        bw.flush();
                       System.out.println("["+temp6+" "+","+"return"+" "+","+line+"]");
                
            }
                   
              //type modifier
              
                  
                     if(Arrays.asList(TM).contains(temp6)){
                         
                         bw.println(temp6+","+"TM"+","+line);
                          bw.flush();
                         System.out.println("["+temp6+" "+","+"TM"+" "+","+line+"]");
                
            }
                     
                     if(Arrays.asList(until).contains(temp6)){
                         
                         bw.println(temp6+","+"until"+","+line);
                          bw.flush();
                         System.out.println("["+temp6+" "+","+"until"+" "+","+line+"]");
                
            }
              
              
              
                     //Assignment
                            if(Arrays.asList(Assignment).contains(temp6)){
                                
                                bw.println(temp6+","+"AO"+","+line);
                                bw.flush();
                         System.out.println("["+temp6+" "+","+"AO"+" "+","+line+"]");
                
            }
                            //=
//                             if(Arrays.asList(eq).contains(temp6)){
//                                
//                                bw.println(temp6+","+"-"+","+line);
//                                bw.flush();
//                         System.out.println("["+temp6+" "+","+"-"+" "+","+line+"]");
//                
//            }
                            //RO
                                        if(Arrays.asList(RO).contains(temp6)){
                                            
                                            bw.println(temp6+","+"RO"+","+line);
                                            bw.flush();
                         System.out.println("["+temp6+" "+","+"RO"+" "+","+line+"]");
                                        }
            
                               //greater than
                                        if(Arrays.asList(Gt).contains(val2)){
                                            
                                            bw.println(val2+","+"RO"+","+line);
                                            bw.flush();
                         System.out.println("["+val2+" "+","+"RO"+" "+","+line+"]");
                
            }
                                              //Less than
                                        if(Arrays.asList(Lt).contains(val2)){
                                            
                                            bw.println(val2+","+"RO"+","+line);
                                            bw.flush();
                         System.out.println("["+val2+" "+","+"RO"+" "+","+line+"]");
                
            }
              
              
                                //or        
//                 if(Arrays.asList(OR).contains(temp6)){
//                     bw.println(temp6+","+"OR"+","+line);
//                 bw.flush();
//                System.out.println("["+temp6+" "+","+"OR"+" "+","+line+"]");
//                
//            }
                 //NOT
                     if(Arrays.asList(NOT).contains(temp6)){
                         bw.println(temp6+","+"NOT"+","+line);
                         bw.flush();
                System.out.println("["+temp6+" "+","+"NOT"+" "+","+line+"]");
               
            }
                          //call
                                  if(Arrays.asList(call).contains(temp6)){
                              bw.println(temp6+","+"call"+","+line);
                bw.flush();
                System.out.println(temp6+","+"call"+","+line);
                
            }
                     
                     //AND
                           if(Arrays.asList(ANDOR).contains(temp6)){
                               bw.println(temp6+","+"ANDOR"+","+line);
                bw.flush();
                System.out.println("["+temp6+" "+","+"ANDOR"+" "+","+line+"]");
                
            }
                         //  ADD SUM
                         if(Arrays.asList(ADDSUM).contains(val2)){
                             bw.println(val2+","+"ADDSUM"+","+line);
                bw.flush();
                System.out.println("["+val2+" "+","+"ADDSUM"+" "+","+line+"]");
              
            }
                                 //  ADD SUM
                         if(Arrays.asList(di).contains(val2)){
                             bw.println(val2+","+"_"+","+line);
                bw.flush();
                System.out.println("["+val2+" "+","+"_"+" "+","+line+"]");
              
            }
              
                         
                         
                         
                         //MULT
                          if(Arrays.asList(MUL).contains(val2)){
                              
                               if(Arrays.asList(MUL).contains(val2)){
                                   
                                   
                              bw.println(val2+","+"MUL"+","+line);
                bw.flush();
                System.out.println(val2+","+"MUL"+","+line);
                
            }   
                          }
                          //DIVMOD
                                  if(Arrays.asList(DIVMOD).contains(val2)){
                              bw.println(val2+","+"DIVMOD"+","+line);
                bw.flush();
                System.out.println(val2+","+"DIVMOD"+","+line);
                
            }
               
                                    //SBO
                          if(Arrays.asList(SBO).contains(val2)){
                              bw.println(val2+","+"("+","+line);
                bw.flush();
                System.out.println(val2+","+"("+","+line);
                
            }
                                  //SBC
                          if(Arrays.asList(SBC).contains(val2)){
                              bw.println(val2+","+")"+","+line);
                bw.flush();
                System.out.println(val2+","+")"+","+line);
                
            }  
                               if(Arrays.asList(eq).contains(val2)){
                                
                                bw.println(val2+","+"="+","+line);
                                bw.flush();
                         System.out.println("["+val2+" "+","+"="+" "+","+line+"]");
                
            }
                                    //SCO
                          if(Arrays.asList(SCO).contains(val2)){
                              bw.println(val2+","+"{"+","+line);
                bw.flush();
                System.out.println(val2+","+"{"+","+line);
                
            }
                               //SCO
                          if(Arrays.asList(colan).contains(val2)){
                              bw.println(val2+","+":"+","+line);
                bw.flush();
                System.out.println(val2+","+":"+","+line);
                
            }
                                    //SCC
                          if(Arrays.asList(SCC).contains(val2)){
                              bw.println(val2+","+"}"+","+line);
                bw.flush();
                System.out.println(val2+","+"}"+","+line);
                
            }
                            
                          //SLO
                          
                         if(Arrays.asList(SLO).contains(val2)){
                             bw.println(val2+","+"["+","+line);
                bw.flush();
                System.out.println("["+val2+" "+","+"["+" "+","+line+"]");
                
            }
                         
                         //proto
                                  if(Arrays.asList(proto).contains(val2)){
                             bw.println(val2+","+"#"+","+line);
                bw.flush();
                System.out.println("["+val2+" "+","+"#"+" "+","+line+"]");
                
            }
                         
                         
                          //Sep
                          
                         if(Arrays.asList(sep).contains(val2)){
                             bw.println(val2+","+"|"+","+line);
                bw.flush();
                System.out.println("["+val2+" "+","+"|"+" "+","+line+"]");
                
            }
              
                                        //SCC
                          if(Arrays.asList(SLC).contains(val2)){
                              bw.println(val2+","+"]"+","+line);
                bw.flush();
                System.out.println(val2+","+"]"+","+line);
                
            }
                                                 //;
                          if(Arrays.asList(E).contains(val2)){
                              bw.println(val2+","+";"+","+line);
                bw.flush();
                System.out.println(val2+","+";"+","+line);
                
            }
                                                 //@
                          if(Arrays.asList(acc).contains(val2)){
                              bw.println(val2+","+"@"+","+line);
                bw.flush();
                System.out.println(val2+","+"@"+","+line);
                
            }
              
                         
                                                 //Delimeters
         
                     
             
                         //not
                         
             if( !Arrays.asList(KW).contains(temp6)&& !Arrays.asList(DT).contains(temp6)&& !Arrays.asList(RO).contains(temp6)
                                && !Arrays.asList(MUL).contains(val2) && !Arrays.asList(DIVMOD).contains(val2) && !Arrays.asList(Sp).contains(val2)
                     && !Arrays.asList(Sp).contains(temp2)
                     && !Arrays.asList(Sp).contains(temp3)
                                 && !Arrays.asList(D).contains(temp2)
                                 && !"~".equals(temp2)
                                && !".".equals(temp2)
                                && !"'".equals(temp2)
                    
                                && !"$".equals(temp2)
                                 
                                 && !Arrays.asList(ADDSUM).contains(val2)
                      && !Arrays.asList(SBO).contains(val2)
                         && !Arrays.asList(colan).contains(val2)
                      && !Arrays.asList(SBC).contains(val2)
                      && !Arrays.asList(Gt).contains(val2)
                      && !Arrays.asList(Lt).contains(val2)
                       && !Arrays.asList(SCO).contains(val2)
                       && !Arrays.asList(SCC).contains(val2)
                       && !Arrays.asList(SLO).contains(val2)
                       && !Arrays.asList(SLC).contains(val2)
                       && !Arrays.asList(E).contains(val2)
                       && !Arrays.asList(acc).contains(val2)
                      && !Arrays.asList(sep).contains(val2)
                        && !Arrays.asList(di).contains(val2)
                      && !Arrays.asList(eq).contains(val2)
                     && !Arrays.asList(proto).contains(val2)
                                 &&!Arrays.asList(NL).contains(temp)
                                 &&!Arrays.asList(INCDEC).contains(temp)
                                 &&!Arrays.asList(AM).contains(temp)
                                 &&!Arrays.asList(St).contains(temp)
                                 &&!Arrays.asList(Assignment).contains(temp)
                                 //&&!Arrays.asList(OR).contains(temp)
                                 &&!Arrays.asList(NOT).contains(temp)
                                 &&!Arrays.asList(ANDOR).contains(temp)
//                                 &&!Arrays.asList(eq).contains(temp)
                                 
                                 &&!Arrays.asList(TM).contains(temp)
                                 &&!Arrays.asList(SST).contains(temp)
                                  
                                 
                                 
                                 //&& !temp3.matches("(-)?[0-9]+")//nteeger
                                 && !temp6.matches("^![A-Za-z0-9\\S+\\W]*!")//MComm
                                 && !temp6.matches("^!![a-zA-Z0-9\\S+\\W]*(nl)")//single line
                     &&!temp6.matches("^'[(\\s)]*")
                    && !temp.matches("[-+]?[0-9]*[(\\.)]")
                     && !temp3.matches("[-+]?[0-9]*[(\\.)]")
                     
                                 && !temp.matches("[-+]?[0-9]*[(\\.)][a-zA-Z0-9]+")
                                  && !temp3.matches("[-+]?[0-9]*[(\\.)][a-zA-Z0-9]+")
                                 && !temp3.matches("[-+]?[0-9]*[(\\.)][a-zA-Z0-9]+")
                                 && !temp3.matches("[-+]?[0-9]*[(\\.)][a-zA-Z0-9]+")
                     && !temp3.matches("[-+]?[0-9a-zA-Z]+")
                     && !temp.matches("[-+]?[0-9a-zA-Z]+")
                                  && !temp3.matches("[-+]?[0-9]+")
                                  && !temp.matches("[-+]?[0-9]+")
                     && !temp6.matches("[-+]?[0-9]+")
                     
                                 && !temp6.matches("^'[A-Za-z0-9\\W]'")//chara
                                 && !temp6.matches("\".*\"")//string
                     &&!temp3.matches("^'")
                      &&!temp.matches("^'")
                      
                              
                            && !temp6.matches("[a-zA-Z][a-zA-Z0-9_]*")){
                                

                             
                             bw.println(temp6+" "+"Invalid Not Allowed at line number:"+" "+line);
                             bw.flush();
                             System.out.println(temp6+" "+"Invalid Not Allowed at line number:"+" "+line);
                             
                             
            
            } 
                    temp="";
                    temp2="";
                    temp6="";
                    temp7="";
                    val2="";
                    check2="";
                    
//                    val3="";
                    
                    i++;
                   j++;
            
               
                 
       
                   }
                   
                       bw.println("$"+","+"$"+","+line);
                       System.out.println("$"+","+"$"+","+line);
                        bw.flush();
                        scanner.close();
                        bw.close();
    
    }
}



    
    
    
    

   