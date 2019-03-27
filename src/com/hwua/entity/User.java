package com.hwua.entity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class User {
    private Integer user_id;
    private String user_username;
    private String user_password;

    public User() {
    }

    public User(Integer user_id, String user_username, String user_password) {
        this.user_id = user_id;
        this.user_username = user_username;
        this.user_password = user_password;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_username='" + user_username + '\'' +
                ", user_password='" + user_password + '\'' +
                '}';
    }
    //method = RequestMethod.POST - 只接受POST请求
    /*@RequestMapping(value = "/test1",
                    method = RequestMethod.POST)
    public String test1(){
        return "welcome";
    }*/

    //params = {"username","password","tel"} - 参数中必须包含
    /*@RequestMapping(value = "/test1",
            method = RequestMethod.POST,
            params = {"username","password","tel"})
    public String test1(){
        return "welcome";
    }*/

    //params = {"username","password","!tel"} - 参数中必须不包含 tel
    /*@RequestMapping(value = "/test1",
            method = RequestMethod.POST,
            params = {"username","password","!tel"})
    public String test1(){
        return "welcome";
    }*/

    //params = {"username=admin","password!=admin"}
    // 必须包含指定参数名，并且参数值为/不能为。。。
    /*@RequestMapping(value = "/test1",
            method = RequestMethod.POST,
            params = {"username=admin","password!=admin"})
    public String test1(){
        return "welcome";
    }*/

    //获取请求中的参数
    /*@RequestMapping(value = "/test1",method = RequestMethod.POST)
    public String test1(String username, String password){

        System.out.println("username="+username);
        System.out.println("password="+password);
        return "welcome";
    }*/

    //@RequestParam("username1") String username 用校正器校正参数名称
    /*@RequestMapping(value = "/test1",method = RequestMethod.POST)
    public String test1(@RequestParam(value = "username1") String username,
                        @RequestParam("password1") String password){

        System.out.println("username="+username);
        System.out.println("password="+password);
        return "welcome";
    }*/

    //----------------------------整体入参---------------------------
    //以实体类的形式接受参数（请求中的参数名和实体类中的属性名要相同）
    /*@RequestMapping(value = "/test1",method = RequestMethod.POST)
    public String test1(User user){
        System.out.println("username="+user.getUser_id());
        System.out.println("username="+user.getUser_username());
        System.out.println("password="+user.getUser_password());
        return "welcome";
    }*/

    //获取请求中的参数
    @RequestMapping(value = "/test1/{user_username}/{user_password}")
    public String test1(@PathVariable("user_username") String username,
                        @PathVariable("user_password") String password){
        System.out.println("id=");
        System.out.println("username="+username);
        System.out.println("password="+password);
        return "welcome";
    }

}
