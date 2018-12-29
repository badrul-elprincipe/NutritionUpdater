/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author user
 */
public class user_res {
    private String res_id,name,h_no,area,city;
    
    public user_res(String res_id,String name,String h_no,String area,String city) {
        this.res_id=res_id;
        this.name=name;
        this.h_no=h_no;
        this.area=area;
        this.city=city;
    }
    public String getres_id() {
        return res_id;
    }
    public String getname() {
        return name;
    }
    public String geth_no() {
        return h_no;
    }
    public String getarea() {
        return area;
    }
    public String getcity() {
        return city;
    }
    
    
}
