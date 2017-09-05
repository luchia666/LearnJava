package ru.lesson.lessons;
public class Calculator{
    
    private double result;

    /**
     * Сложение двух параметров
      * @param param1
     * @param param2
     * @throws UserException Если данных нет, выводим исключения
     */
    public void add (double param1, double param2) throws Exception{
           if(param1<=0 || param2<=0){throw new Exception("You should enter date");}
           else
            this.result = param1+param2;
            

    }
    
    public void minus (double param1, double param2){
        this.result = param1 - param2;
    }
    
    public void multiplication (double param1, double param2)throws IllegalStateException{
        if(param1<=0 || param2<=0){throw new IllegalStateException("You should enter date");}
        else
        this.result = param1 * param2;
     }     
     
    public void division (double param1, double param2){
        this.result =  param1/param2;
     } 
    
    public double getResult(){
        return this.result;    
    }
    
    public void cleanResult() {
        this.result = 0;
    }
    
    public static  void main(String[] arg){
//        System.out.println("YRAAAAAAAAA");
//        int first = Integer.valueOf(arg [0]);
//        int second = Integer.valueOf(arg[1]);
//        int sum = first + second;
//        System.out.println("Summa " + sum);
      }

}