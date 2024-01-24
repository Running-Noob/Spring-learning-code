package cn.f.spring6.service;

import cn.f.spring6.dao.StudentDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author fzy
 * @date 2024/1/24 13:52
 */
@Service
public class StudentService {
    //@Resource(name = "studentDaoImplForMysql")
    // 如果直接使用@Resource，那在这里Spring框架会在XML配置文件指定的包下寻找id为studentDao的bean。
    // 如果还是找不到，再根据类型自动装配
    @Resource
    private StudentDao studentDao;

    public void deleteStudent() {
        studentDao.deleteById();
    }
}
