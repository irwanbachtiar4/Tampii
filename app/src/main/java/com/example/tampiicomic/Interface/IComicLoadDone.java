package com.example.tampiicomic.Interface;

import com.example.tampiicomic.Model.Comic;

import java.util.List;

public interface IComicLoadDone {
    void onComicLoadDoneListener(List<Comic> comicList);
}
