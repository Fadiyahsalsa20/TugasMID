/* Fadiyah Salsabila
 * 13020210203
 */

package com.mycompany.central0203;

interface A{ 
    public void aaa(); 
}

interface B extends A{
    public void aaa();
}

class Central0203 implements A,B{
public void aaa(){
System.out.println("aaa");
}
public static void main(String arg[]){
     Central0203 obj = new Central0203();
        System.out.println("main");
        obj.aaa();
}
 }

