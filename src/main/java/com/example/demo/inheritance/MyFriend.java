package com.example.demo.inheritance;


import lombok.Data;
import lombok.NoArgsConstructor;

public class MyFriend {
    public Friend[] getFriends(){
        Friend[] friends = new Friend[4];
        String[] names = {"LEE","SEO","YOON","PARK"};
        String[] major = {"Computer","Electronics"};
        String[] department = {"R&D 1","R&D 2"};
        String[] phone = {"010-1234","010-2345","010-5566","010-9983"};
        for(int i=0; i<friends.length; i++){
            friends[i] =(i < 2) ? new UnivrFriend(names[i], major[i], phone[i])
                    : new CompFriend(names[i],department[i-2],phone[i]);;
        }
        return friends;
    }

}
@NoArgsConstructor
@Data class Friend{
    protected String name;
    protected String phone;
    public Friend(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
}

@Data class UnivrFriend extends Friend{
    private String major;
    public UnivrFriend(String na, String ma, String ph){
        super(na, ph);
        this.major = ma;
    }
    @Override public String toString(){
        return String.format("대학친구 : %s %s %s",name,major,phone);
    }
}
@Data class CompFriend extends Friend{
    private String department;
    public CompFriend(String na, String de, String ph){
        super(na, ph);
        this.department = de;
    }
    @Override public String toString() {
        return String.format("직장동료 : %s %s %s",name,department,phone);
        }
}