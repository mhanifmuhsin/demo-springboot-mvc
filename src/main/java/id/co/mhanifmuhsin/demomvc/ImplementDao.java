package id.co.mhanifmuhsin.demomvc;

import org.springframework.stereotype.Service;

@Service
public class ImplementDao implements HomeDao {

    @Override
    public String getDataHome() {
        HomeModel homeModel = new HomeModel();
        homeModel.setId("007");
        homeModel.setName("James Bond");
        return homeModel.getName();
    }
}
