
class Node<T>{

public T data:

public Node <> next;

public Node (T d)
{
next=null;
data=d;
}


public class LinkedList<T>
{
private Node<T> Head;
private Node<T> current;

public LinkedList (){
Head=current=null;}

public boolean isEmpty(){
return Head==null;}

public boolean Full(){
return false;}

public boolean last(){
return current.next==null;}

public void FindFirst(){
current=Head;}

public void findNext(){
current=current.next;}

public void update (T d){
current.data=d;}

public T retrieve(){
return current.data;}

public void insert (T d){
Node<T> p=new Node<T>(d);
if (Head==null){
Head=p;
current=p;}
else{
p.next= current.next;
current.next=p:
current=p;}
}

public void remove()
{
if (current==Head){
Head=Head.next;
current=current.next;}
else{
Node<T>p=Head;
while(p.next!=current){
p=p.next;}
p.next=current.next;
if(current.next!=null){
current=current.next;)}
else
current=Head;}
}

public boolean search (T X){
Node <T> temp =Head;
while (temp!=null){
if (temp.data.equals (X))
return true;
else
temp=temp.next;}
return false;}

public void display(){
Node cur=Head;
while (cur!=null){
System.out.print(cur.data+" ");
cur=cur.next;}
}

public void Add_Sorted1 (T d){

Node<T> p=new Node<T> (d);
if (Head==null)
{
Head=p;
current=p;
return;
}

else
{

//if smaller than first
if ( ( (Contact) d).compareTo ( ( (Contact) Head.data) .getContact_name () ) <0)
{
p.next=Head;
Head=p;
return;
}

//search for its position and insert
else{
Node<T>r=Head, q=null;
while(r!=null&& (((Contact) r.data) . compareTo ( ( (Contact) d) .getContact_name ()) <=0)) {
q=r;
r=r.next;}
}}}
