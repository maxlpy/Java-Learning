package DesignPattern;

import java.util.ArrayList;
import java.util.List;

class MenuItem {
    private String name;
    private String description;
    private int channe;
    
    public MenuItem(int channe,String name,String description){
        this.name = name;
        this.description = description;
        this.channe = channe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getChanne() {
        return channe;
    }

    public void setChanne(int channe) {
        this.channe = channe;
    }
}

interface Iterator {
    boolean hasNext();
    Object next();
}
class FilmMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position = 0;
    
    public FilmMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }
    
    public boolean hasNext() {
        if(position > menuItems.length-1 || menuItems[position] == null){
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = menuItems[position];
        position ++;
        return menuItem;
    }

}
class TVChanneMenuIterator implements Iterator{

    List<MenuItem> menuItems;
    int position = 0;
    
    public TVChanneMenuIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }
    
    public boolean hasNext() {
        if(position > menuItems.size()-1 || menuItems.get(position) == null){
            return false;
        }
        else{
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position ++;
        return menuItem;
    }
}
interface TelevisionMenu {
    public void addItem(int channe,String name,String description);
    public Iterator createIrerator();
}
class FilmMenu implements TelevisionMenu{
    static final int MAX_ITEMS = 5;    //菜单最大长度
    MenuItem[] menuItems;
    int numberOfItems = 0;
    
    /**
     * 构造函数完成初始化
     */
    public FilmMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem(1, "绝世天劫", "这是布鲁斯威利斯主演的...");
        addItem(2, "达芬奇密码", "这是我最喜欢的电影之一...");
        addItem(3, "黑客帝国123", "不知道你能够看懂不???");
        addItem(4, "我的女友是机器人", "一部我不反感的经典爱情电影...");
        addItem(5, "肖申克的救赎", "自由，幸福，离你有多远");
    }
    
    /**
     * @desc 将电影解决添加到菜单项中
     * @param channe
     * @param name
     * @param description
     * @return void
     */
    public void addItem(int channe,String name,String description){
        MenuItem tvmenuiItem = new MenuItem(channe, name, description);
        //判断数组是否越界
        if(numberOfItems > MAX_ITEMS){
            System.out.println("不好意思，菜单满了....");
        }
        else{
            menuItems[numberOfItems] = tvmenuiItem;
            numberOfItems ++;
        }
    }

    public Iterator createIrerator() {
        return new FilmMenuIterator(menuItems);
    }
}
class TVChanneMenu implements TelevisionMenu{
    List<MenuItem> menuItems;
    
    /**
     * 构造函数完成初始化
     */
    public TVChanneMenu(){
        menuItems = new ArrayList<MenuItem>();
        addItem(1, "CCTV-1", "This is CCTV-1");
        addItem(2, "CCTV-2", "This is CCTV-2");
        addItem(3, "CCTV-3", "This is CCTV-3");
        addItem(4, "CCTV-4", "This is CCTV-4");
        addItem(5, "CCTV-5", "This is CCTV-5");
    }
    
    /**
     * @desc 将电视频道节目添加菜单集合中
     * @param channe  频道
     * @param name  名称
     * @param description  描述
     * @return void
     */
    public void addItem(int channe,String name,String description){
        MenuItem tvMenuItem = new MenuItem(channe, name, description);
        menuItems.add(tvMenuItem);
    }

    public Iterator createIrerator() {
        return new TVChanneMenuIterator(menuItems);
    }
}
class MainMenu {
    TelevisionMenu tvMenu;
    FilmMenu filmMenu;
    
    public MainMenu(TelevisionMenu tvMenu,FilmMenu filmMenu){
        this.tvMenu = tvMenu;
        this.filmMenu  = filmMenu;
    }
    
    public void printMenu(){
        Iterator tvIterator = tvMenu.createIrerator();
        Iterator filmIterator = filmMenu.createIrerator();
        
        System.out.println("电视节目有:");
        printMenu(tvIterator);
        System.out.println("----------------------------------------------------------------");
        System.out.println("电影节目有:");
        printMenu(filmIterator);
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print("channe:"+menuItem.getChanne()+",  ");
            System.out.print("name:"+menuItem.getName()+",  ");
            System.out.println("description :"+menuItem.getDescription());
        }
    }
}

public class IteratorDemo {
	public static void main(String[] args) {
        TVChanneMenu tvMenu = new TVChanneMenu();
        FilmMenu filmMenu = new FilmMenu();
        
        MainMenu mainMenu = new MainMenu(tvMenu, filmMenu);
        mainMenu.printMenu();
    }
}
