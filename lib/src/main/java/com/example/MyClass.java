package com.example;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String agrs[]){
        MyData myData = new MyData();
        List<MyNews> myNewses = new ArrayList<>();
        MyNews new1 = new MyNews("新闻","http://baidu.com");
        MyNews new2 = new MyNews("小说","http://baidu.com");
        MyNews new3 = new MyNews("视频","http://baidu.com");
        myNewses.add(new1);
        myNewses.add(new2);
        myNewses.add(new3);
        myData.setMyNewses(myNewses);

        System.out.print(new Gson().toJson(myData));
    }
    public static class MyNews{
        private String title;
        private String link;

        public MyNews(String title, String link) {
            this.title = title;
            this.link = link;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }
    }

    public static class MyData{
        private List<MyNews> myNewses;

        public List<MyNews> getMyNewses() {
            return myNewses;
        }

        public void setMyNewses(List<MyNews> myNewses) {
            this.myNewses = myNewses;
        }
    }
}
