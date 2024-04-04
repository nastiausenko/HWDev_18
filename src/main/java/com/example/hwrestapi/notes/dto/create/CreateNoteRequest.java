package com.example.hwrestapi.notes.dto.create;

import lombok.Data;

@Data
public class CreateNoteRequest {
    private String title;
    private String content;
}
