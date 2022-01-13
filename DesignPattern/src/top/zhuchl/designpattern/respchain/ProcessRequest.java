package top.zhuchl.designpattern.respchain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

/**
 * 请求类
 *
 * @Author AlphaZcl
 * @Date 2021/12/10
 **/
@Data
@AllArgsConstructor
public class ProcessRequest {

    private String type;

    private Map<String,Object> paramMap;


}
