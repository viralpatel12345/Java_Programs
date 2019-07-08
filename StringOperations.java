package stringoperations;

import java.util.ArrayList;
import java.util.Arrays;

public class StringOperations 
{

    public static void main(String[] args) 
    {
        /* REVERSE STRING  */
          String str="NitiN";
          String reverse="";
          int i=str.length()-1;
          while(i>=0){
              reverse+=str.charAt(i);
              i--;
          }
          System.out.println("Original String = "+str);
          System.out.println("Reversed String = "+reverse);
      
          /* CHECK STRING IS PALINDROME OR NOT  */
          if(str.equals(reverse)){
              System.out.println("\nString is PALINDROME");
          }
          else {
              System.out.println("\nString is NOT PALINDROME");
          }
          
         /* Check Whether given Number is Palindrome or NOT */
         
         System.out.println("");
         
         long num=876787678L;
         int rem=0;
         long temp=num;
         long rev=0L;
         while(num!=0) {
             rem=(int)(num%10);
             num=num/10;
             rev=rev*10+rem;
         }
         if(temp==rev){
             System.out.println(temp+" is Palindrome");
         }
         else {
             System.out.println(temp+" is Not Palindrome");
         }
         
         /* Factorial of Number  */
         int number=5;
         System.out.println("\nFactorial of "+number+" = "+fact(number));
        
         /* Factorial of all Numbers in Given Range */
            System.out.println("\nList of Factorials between two numbers =>");
            int start=1;
            int end=8;
            int s=start;
            ArrayList<Long> arr= factRange(start,end);
            for(long fact:arr){
                 System.out.println(s+" ! = "+fact);
                 s++;
            }
            
        /* Check whether Given Number is Armstrong or NOT ( abc == a^3 + b^3 + c^3 )*/
   
         System.out.println("");
         int n=370;
         if(armstrong(n)==true)
         {
             System.out.println(n+" is ARMSTRONG Number");
         }
         else 
         {
             System.out.println(n+" is NOT ARMSTRONG Number");
         }
         
         /* Find Number of Occurances of Each Character in String */
         System.out.println("\nFind Number of Occurances of Each Character in String OR Array of Characters");
         String st="ABCBDCDACEBAAFBACADE";
         char charArray[]=st.toCharArray();
         System.out.println("String = "+st);
         System.out.println("Array of Chars = "+Arrays.toString(charArray));
         ArrayList<Character> c= new ArrayList<>();
         ArrayList<Integer> counter = new ArrayList<>();
         int count=1;
         int p,q;
         for(p=0;p<st.length()-1;p++)
         {
             for(q=p+1;q<st.length();q++)
             {
                if(st.charAt(p)==st.charAt(q)){
                    count++;
                }
             }
             if(c.contains(st.charAt(p))==false){
                 c.add(st.charAt(p));
                 counter.add(count);
             }
             count=1;
         }
         for(char ch:c)
         {
             System.out.println(ch+" : "+counter.get(c.indexOf(ch)));
         }
         
         /* ARRAYS : Find Biggest and Smallest Element from Given Array */
         int A[]={8,4,5,2,6,3,1,9,5};
         System.out.println("\nArray = "+Arrays.toString(A));
         System.out.println("MAX = "+max(A));
         System.out.println("MIN = "+min(A));
         
         /* Prime Numbers between 2 to 100  */
         System.out.println("\nPrime Numbers between 2 to 100 : ");
         int ctr=0;
         for(int ind=2;ind<=100;ind++)
         {   
             if(isPrime(ind)){
                 System.out.print(ind+" ");
                 ctr++;
             }
         }
         System.out.println("");
         
         /* Greatest of Three Numbers */
         System.out.println("\nGreatest of Three = "+greatestOfThree(5, 29, 6));
         
         /* Smallest of Three Numbers */
         
         System.out.println("\nSamllest of Three = "+smallestOfThree(29,5,9));
         
         /* Mathematical Table for Given Number */
         
         System.out.println("\nMathematical Table");
         table(19);
         System.out.println("\nMathematical Table from 1 to 10");
         table(1,10);
         
         /* Compare Two Strings */
         System.out.print("\nCompare Two Strings : ");
         String str1="India",str2="Hindustan";
         
         if(str1.compareTo(str2)<0) {
             System.out.print(str1+" is Samller than "+str2);
         }
         else if(str1.compareTo(str2)>0)
         {
             System.out.print(str1+" is Greater than "+str2);
         }
         else if(str1.compareTo(str2)==0){
             System.out.print(str1+" is Equal to "+str2);
         }
         
         /* Binary search Algorithm */
         System.out.println("\n\nBinary Search Algorithm");
         int Arr[]={12,73,555,33,11,1,92,4,23,9,37,14,3,133,6,54,324,65,333,25,29,38,7,285,5,13,444,17,8,2,77};
         
         // SORT THE ARRAY USING SELECTION SORT ALGORITHM
         
        int sortedArr[]=sort(Arr);
        System.out.println(Arrays.toString(sortedArr));
        int key=65; 
        int index = binarySearch(sortedArr,key,0,sortedArr.length-1);
        if(index !=-1)
        {
            System.out.println("Key = "+key+" found at Index Position "+index);
        }
        else
        {
            System.out.println("Key NOT Found in the Given Array");
        }
        
        /* Remove Duplicates from the Given Array */
        System.out.println("\nRemove Duplicates from the Given Array");
        int Array[]={1,2,3,1,2,4,4,5,2,6,1,4,7,2,6,8,3,2,5,6,3,9};
        System.out.println(Arrays.toString(Array));
        System.out.println(removeDuplicates(Array));
        
        /* Delete Element From Array */
        System.out.println("\nDelete Element From Array");
        int array[]={1,2,3,5,6,8,9,3,2,9};
        int k=3;
        System.out.println("Before Deleting "+k+" : "+Arrays.toString(array));
        delete(array,k);
        
        /* Insert new Element in Array */
        System.out.println("\nInsert New Element in Array");
        int arr1[]={1,2,3,4,5,5,7,8,9};
        System.out.println("Before Inserting : "+Arrays.toString(arr1));
        insert(arr1, 5, 6);
        
        
  }
         
    static long fact(int num)
    {
        long fac=1L;
        for(int i=1;i<=num;i++)
        {
            fac*=i;
        }
        return fac;
     }
   
    static ArrayList factRange(int start,int end)
    {
       long fac=1L;
       ArrayList<Long> array = new ArrayList();
       for(int i=start;i<=end;i++)
       {
           for(int j=1;j<=i;j++)
           {
               fac*=j;        
           }
           array.add(fac);
           fac=1L;
       }
       return array;
    }
    
    static boolean armstrong(int num)
    {
       int temp=num;
       int rem=0;
       int arm=0;
       while (num!=0) {
          rem=num%10;
          num=num/10;
          arm=arm+(rem*rem*rem);
           
       }
       return temp==arm;
    }
    
    static int min(int A[])
    {
        int smallest=A[0];
         for(int index=1;index<A.length;index++){
            if(A[index]<smallest){
                smallest=A[index];
            }
         }
         return smallest;
    }
    static int max(int A[])
    {
        int largest=A[0];
         for(int index=1;index<A.length;index++){
            if(A[index]>largest){
                largest=A[index];
            }
         }
         return largest;
    }
    static boolean isPrime(int x)
    {
         for(int y=2;y<x;y++)
         {
             if(x%y==0){
                 return false;
             }
         }
         return true;
    }
    
    static int greatestOfThree(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }
    
    static int smallestOfThree(int a,int b,int c){
        if(a<b){
            if(a<c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b<c){
                return b;
            }
            else{
                return c;
            }
        }
    }
    
    static void table(int number)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+" * "+i+" = "+(number*i));
        }
    }
    
    static void table(int num1,int num2)
    {
        for(int i=num1;i<=num2;i++)
        {
            System.out.print(i+" => ");
            for(int j=1;j<=10;j++)
            {
                System.out.print((i*j)+" , ");
                if(j==10){
                    System.out.print(i*j);
                }
            }
            System.out.println();
        }
    }
    
    static int[] sort(int A[]){
        int minimum;
        for(int i=0;i<A.length-1;i++)
        {
            minimum=i;
            for(int j=i+1;j<A.length;j++)
            {
                 if(A[j]<A[minimum]) 
                 {
                     minimum=j;
                 }   
            }
            
            int temp=A[i];
            A[i]=A[minimum];
            A[minimum]=temp;
        }
        
        return A;
    }
    
    static int binarySearch(int A[],int key,int low,int high)
    {
        int start=low,end=high;
        int mid=(start+end)/2;
        
        while(start!=end){
        if(A[mid]==key){
           return mid;
            
        }
        else if(A[mid]>key){
             return binarySearch(A, key,0,mid-1);
        }
        else if(A[mid]<key){
            return binarySearch(A, key, mid+1, end);
        }
           
        }
        return -1;
        
    }
    
    static ArrayList removeDuplicates(int A[])
    {
        ArrayList<Integer> list=new ArrayList<>();
    
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<A.length;j++)
            {
                if(A[i]==A[j] && list.contains(A[i])==false)
                {
                   list.add(A[i]);
                }        
            }
        }
        return list;
    }
    
    static void delete(int A[],int key)
    {
        int index=-1;
        
        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Element Not Found in Array");
        }
        int B[]=new int[A.length-1];
        int count=index;
        for(int i=0;i<index;i++)
        {
            B[i]=A[i];
        }
        
        if(index!=-1)
        {
           while(count<=B.length-1)
           {
               B[count]=A[count+1];
               count++;
           }
            
        }
        
        System.out.println("After Deleting "+key+" : "+Arrays.toString(B));
    }
    
    static void insert(int A[],int index,int value)
    {
        if(index > A.length-1)
        {
            System.out.println("IndexOutOfBoundsException");
        }
        else
        {
            int B[]=new int[A.length+1];
            for(int i=0;i<index;i++)
            {
                B[i]=A[i];
            }
            B[index]=value;
            for(int i=index+1;i<B.length;i++)
            {
               B[i]=A[i-1];
            }
            System.out.println("After Inserting : "+Arrays.toString(B));
        }
    }


}
