package org.csc133.a2.gameobjects;

import java.util.ArrayList;
import java.util.Iterator;

import com.codename1.ui.Graphics;
import com.codename1.ui.geom.Point;

//Used for Fire class
//
public abstract class GameObjectCollection<T> extends GameObjects implements Iterable<T>{

    ArrayList<T> GameObjs;
    class GameObjectIterator implements Iterator<T>{
        int index = 0;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return index < GameObjs.size();
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            return GameObjs.get(index++);
        }


    }
    public GameObjectCollection(){

        GameObjs = new ArrayList<>();
    }

    public  ArrayList<T> getGameObjects(){
        return GameObjs;
    }

    public void add(T gameObjects){
        GameObjs.add(gameObjects);
    }

    public void remove(T gameObjects){
        GameObjs.remove(gameObjects);
    }

    public int size(){
        return GameObjs.size();
    }

    @Override
    public void draw(Graphics g, Point containerOrigin) {

    }

    @Override
    public Iterator<T> iterator() {
        return new GameObjectIterator();
    }
}
