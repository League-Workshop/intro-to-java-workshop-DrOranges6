PImage mustache;
PImage friend;
void setup(){
  friend = loadImage("friend.jpg");
size(800,800);
friend.resize(800,800);
mustache = loadImage("mustache.png");
}
void draw(){

  background(friend);
image(mustache,mouseX,mouseY);
mustache.resize(300,125);
}