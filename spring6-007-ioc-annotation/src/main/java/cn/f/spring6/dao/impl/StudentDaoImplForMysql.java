package cn.f.spring6.dao.impl;

import cn.f.spring6.dao.StudentDao;
import org.springframework.stereotype.Repository;

/**
 * @author fzy
 * @date 2024/1/24 13:52
 */
@Repository
public class StudentDaoImplForMysql implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("Mysql数据库正在删除学生信息...");
    }
}
