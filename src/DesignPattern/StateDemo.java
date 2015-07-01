package DesignPattern;
interface State {
    /**
     * @desc 预订房间
     * @return void
     */
    public void bookRoom();
    
    /**
     * @desc 退订房间
     * @return void
     */
    public void unsubscribeRoom();
    
    /**
     * @desc 入住
     * @return void
     */
    public void checkInRoom();
    
    /**
     * @desc 退房
     * @return void
     */
    public void checkOutRoom();
}
class Room {
    /*
     * 房间的三个状态
     */
    State freeTimeState;    //空闲状态
    State checkInState;     //入住状态
    State bookedState;      //预订状态

    State state ;  
    
    public Room(){
        freeTimeState = new FreeTimeState(this);
        checkInState = new CheckInState(this);
        bookedState = new BookedState(this);
        
        state = freeTimeState ;  //初始状态为空闲
    }
    
    /**
     * @desc 预订房间
     * @return void
     */
    public void bookRoom(){
        state.bookRoom();
    }
    
    /**
     * @desc 退订房间
     * @return void
     */
    public void unsubscribeRoom(){
        state.unsubscribeRoom();
    }
    
    /**
     * @desc 入住
     * @return void
     */
    public void checkInRoom(){
        state.checkInRoom();
    }
    
    /**
     * @desc 退房
     * @return void
     */
    public void checkOutRoom(){
        state.checkOutRoom();
    }

    public String toString(){
        return "该房间的状态是:"+getState().getClass().getName();
    }
    
    /*
     * getter和setter方法
     */
    
    public State getFreeTimeState() {
        return freeTimeState;
    }

    public void setFreeTimeState(State freeTimeState) {
        this.freeTimeState = freeTimeState;
    }

    public State getCheckInState() {
        return checkInState;
    }

    public void setCheckInState(State checkInState) {
        this.checkInState = checkInState;
    }

    public State getBookedState() {
        return bookedState;
    }

    public void setBookedState(State bookedState) {
        this.bookedState = bookedState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
class FreeTimeState implements State {
    
    Room hotelManagement;
    
    public FreeTimeState(Room hotelManagement){
        this.hotelManagement = hotelManagement;
    }
    
    
    public void bookRoom() {
        System.out.println("您已经成功预订了...");
        hotelManagement.setState(hotelManagement.getBookedState());   //状态变成已经预订
    }

    public void checkInRoom() {
        System.out.println("您已经成功入住了...");
        hotelManagement.setState(hotelManagement.getCheckInState());   //状态变成已经入住
    }

    public void checkOutRoom() {
        //不需要做操作
    }

    public void unsubscribeRoom() {
        //不需要做操作
    }
}
class BookedState implements State {
    Room hotelManagement;
    
    public BookedState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    public void bookRoom() {
        System.out.println("该房间已近给预定了...");
    }

    public void checkInRoom() {
        System.out.println("入住成功..."); 
        hotelManagement.setState(hotelManagement.getCheckInState());         //状态变成入住
    }

    public void checkOutRoom() {
        //不需要做操作
    }

    public void unsubscribeRoom() {
        System.out.println("退订成功,欢迎下次光临...");
        hotelManagement.setState(hotelManagement.getFreeTimeState());   //变成空闲状态
    }

}
class CheckInState implements State {
    Room hotelManagement;
    public CheckInState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    public void bookRoom() {
        System.out.println("该房间已经入住了...");
    }

    public void checkInRoom() {
        System.out.println("该房间已经入住了...");
    }

    public void checkOutRoom() {
        System.out.println("退房成功....");
        hotelManagement.setState(hotelManagement.getFreeTimeState());     //状态变成空闲
    }

    public void unsubscribeRoom() {
        //不需要做操作
    }
}

public class StateDemo {
	public static void main(String[] args) {
        //有3间房
        Room[] rooms = new Room[2];
        //初始化
        for(int i = 0 ; i < rooms.length ; i++){
            rooms[i] = new Room();
        }
        //第一间房
        rooms[0].bookRoom();    //预订
        rooms[0].checkInRoom();   //入住
        rooms[0].bookRoom();    //预订
        System.out.println(rooms[0]);
        System.out.println("---------------------------");
        
        //第二间房
        rooms[1].checkInRoom();
        rooms[1].bookRoom();
        rooms[1].checkOutRoom();
        rooms[1].bookRoom();
        System.out.println(rooms[1]);
    }
}
