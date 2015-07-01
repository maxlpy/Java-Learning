package DesignPattern;

import java.util.ArrayList;
import java.util.List;

abstract class File {
    String name;
    
    public File(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
}
class Folder extends File{
    private List<File> files;
    
    public Folder(String name){
        super(name);
        files = new ArrayList<File>();
    }
    
    /**
     * 浏览文件夹中的文件
     */
    public void display() {
        for(File file : files){
            file.display();
        }
    }
    
    /**
     * @desc 向文件夹中添加文件
     * @param file
     * @return void
     */
    public void add(File file){
        files.add(file);
    }
    /**
     * @desc 从文件夹中删除文件
     * @param file
     * @return void
     */
    public void remove(File file){
        files.remove(file);
    }
}
class TextFile extends File{

    public TextFile(String name) {
        super(name);
    }

    public void display() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }
}
class ImagerFile extends File{

    public ImagerFile(String name) {
        super(name);
    }

    public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }

}
class VideoFile extends File{

    public VideoFile(String name) {
        super(name);
    }

    public void display() {
        System.out.println("这是影像文件，文件名：" + super.getName());
    }

}

public class CompositeDemo {
	public static void main(String[] args) {
        /**
         * 我们先建立一个这样的文件系统
         *                  总文件
         *                  
         *   a.txt    b.jpg                   c文件夹              
         *                      c_1.text  c_1.rmvb    c_1.jpg   
         *                                                       
         */ 
        //总文件夹
        Folder zwjj = new Folder("总文件夹");
        //向总文件夹中放入三个文件：1.txt、2.jpg、1文件夹
        TextFile aText= new TextFile("a.txt");
        ImagerFile bImager = new ImagerFile("b.jpg");
        Folder cFolder = new Folder("C文件夹");
        
        zwjj.add(aText);
        zwjj.add(bImager);
        zwjj.add(cFolder);
        
        //向C文件夹中添加文件：c_1.txt、c_1.rmvb、c_1.jpg 
        TextFile cText = new TextFile("c_1.txt");
        ImagerFile cImage = new ImagerFile("c_1.jpg");
        VideoFile cVideo = new VideoFile("c_1.rmvb");
        
        cFolder.add(cText);
        cFolder.add(cImage);
        cFolder.add(cVideo);
        
        //遍历C文件夹
        cFolder.display();
        //将c_1.txt删除
        cFolder.remove(cText);
        System.out.println("-----------------------");
        cFolder.display();
    }

}
