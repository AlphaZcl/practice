package top.zhuchl.designpattern.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 非享元角色：外部非享元信息
 *
 * @Author AlphaZcl
 * @Date 2021/12/6
 **/
@Data
@AllArgsConstructor
public class UserInfo {

    private String userName;
}
