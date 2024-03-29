package com.example.crud;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor

public class PostDto {
    private int id;
    @NotNull
    private String title;
    @Size(max = 40)
    private String content;
    @Size(min = 3, max = 10)
    private String writer;
    private int boardId;

    public PostDto(int id, String title, String content, String writer){
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer= writer;
        //this.boardId = boardId;
    }


}
