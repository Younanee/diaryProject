package com.example.nyoun_000.diaryproject.view.init_view.presenter

/**
 * Created by nyoun_000 on 2017-12-22.
 */
interface InitViewContract {
    interface View{
        //ex) 엑티비티에 데이터 보내서 실행시킬 메소드추가

    }
    interface Presenter{
        //var activity:InitViewActivity
        var view : View

    }
}