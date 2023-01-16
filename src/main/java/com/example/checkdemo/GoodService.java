package com.example.checkdemo;

import java.util.List;

public interface GoodService {
    List<Good> findAll();

    Good findById(int id) throws Exception;

/*    void create(String name);

    void update(int id, String name) throws Exception;*/

    //業務処理：コントローラーから受け取ったidと同じユーザーの名前を呼び出すようmapperに指示をだす
    //mapperから受け取った名前をcontrollerに返す（本来はここでpwを削るとか）
}
