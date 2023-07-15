-------------------------------EXCEPTION --------------

![image](https://github.com/ragaPriya224/references/assets/90038032/e9362641-88c0-447e-a53b-6f1f47699150)

![image](https://github.com/ragaPriya224/references/assets/90038032/47bb4c9e-3d77-4b2f-b6fe-03552e98d5ea)


![image](https://github.com/ragaPriya224/references/assets/90038032/c5ad6f77-8094-4db8-8b1b-8d819bda7bf5)

Throwable class -> root for java exception hierarchy

exception: in most cases, exception are caused by our program and these are recoverable

Eg: read data from a remote file @ london file @runtime ,if file not there, file not found exception suppose file not found exception, then we can provide a local file and we can continue the program normally

ERROR:
caused due to lack of resources -- Eg: out of memory error mostly not caused by our programs, these are non recoverable

exceptions that are checked by compiler for smooth execution of program @ runtime Eg: filenotfound exception, interrupted exception

exceptions that are not checked by compiler @runttime Eg: arithmetic exception

FULLY CHECKED EXCEPTION: if and only if all it's child classes are chcked. eg: io exception 

PARTIALLY CHECKED EXCEPTION : if all it's child classes are unchecked . eg: exception , throwable 

-------------------------------------------EXCEPTION TYPES --------------------------------------------------------

![image](https://github.com/ragaPriya224/Dru23Batch1/assets/90038032/1542a2ae-4817-4d3f-aee3-028e15e41e51)

![image](https://github.com/ragaPriya224/Dru23Batch1/assets/90038032/b8c4d195-92e4-476f-a0b0-07842da99bde)


![image](https://github.com/ragaPriya224/Dru23Batch1/assets/90038032/e8cdb0fc-748f-4635-b619-858e7998d8ba)

-------------------------------------------EXCEPTION HANDLING MECHANISM --------------------------------------------------------

![image](https://github.com/ragaPriya224/Dru23Batch1/assets/90038032/26363467-c6c9-4a92-beda-2f2e951114c0)

![image](https://github.com/ragaPriya224/Dru23Batch1/assets/90038032/8f7216c2-6709-4b8d-afe6-f9385f0ac126)



![image](https://user-images.githubusercontent.com/90038032/220435835-98faf648-aa42-42c4-8f37-2c6a46425aaf.png)
-----------------------------------------
![image](https://user-images.githubusercontent.com/90038032/220435877-3ed2b572-d909-44f5-9f23-68d62de0c766.png)

-----------------------------CREATE CUSTOM EXCEPTION ------
![image](https://user-images.githubusercontent.com/90038032/220435952-5c760be0-df59-4d71-99ab-c2e56e7a074d.png)

-----------------------------------
![image](https://user-images.githubusercontent.com/90038032/220435999-5d763dd1-ecc1-41b5-9ed2-76f4be77b325.png)
------------------------------CREATE CUSTOM CHECKED EXCEPTION-------

![image](https://github.com/ragaPriya224/Dru23Batch1/assets/90038032/e3ac4bcb-648c-4bae-90d1-26c2c2138787)

--------------------------------CREATE CUSTOM UNCHECKED EXCEPTION ------------

![image](https://github.com/ragaPriya224/Dru23Batch1/assets/90038032/03f276f3-cbf0-4bb3-a6a1-cd48af9909b4)

-------------------------------------
https://www.youtube.com/watch?v=W-N2ltgU-X4

https://www.geeksforgeeks.org/difference-between-throw-and-throws-in-java/

----------------------------------



TASK:

create a custom exception. it must be thrown, when the email id you're checking , is not present in your list(create a list of email id's).

create a custom unchecked exception , it must be thrown, when the email id you're checking doesn't have '@' in it..
name that exception like, invaliddomainexception or something like that..

standards to follow:
your exception class should end with the name "exception"

------------------------------------------------------------------

![image](https://github.com/ragaPriya224/Dru23Batch2/assets/90038032/7a1ec142-4e13-4653-b86c-bef95c9014e8)

--------------------------------------------------------------

try{

s1;

s2;

s3;

 try{
 
 s4;
 
 s5;
 
 s6;
 
 }
 
 catch(x e){
 
 s7;
 
 }
 
 finally{
 
 s8;
 
 }
 
 s9;
 
}

catch(Y e){

s10;

}

finally{

s11;

}

s12;

case 1: no exception

case 2: ex @s2, handled

Case 3: ex @s2, not handled

Case 4: ex @s5, inner match

Case 5: ex @s5, inner not match, outer matched

Case 6: ex @s5, both not match

Case 7: ex @s7 + catched

Case 8: ex @s7, no match

Case 9: ex @s8, match

Case 10: ex @s8, no match

Case 11: ex @s9, block match

Case 12: ex @s9, no match 

Case 13: ex @10

Case 14: ex @11


