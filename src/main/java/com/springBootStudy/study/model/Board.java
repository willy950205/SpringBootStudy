package com.springBootStudy.study.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(sequenceName = "seq_application", name = "seq_application", allocationSize = 1)
    private Long id;
    @NotNull
    @Size(min = 2, max = 30, message = "제목은 2자 이상 30자 미만입니다.")
    private String title;
    private String content;
}
