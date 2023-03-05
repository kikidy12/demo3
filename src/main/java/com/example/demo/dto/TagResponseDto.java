package com.example.demo.dto;

import com.example.airbnbpractice.entity.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class TagResponseDto {

    private Long id;
    private String name;
    private String imageURL;

    private TagTypeResponseDto tagType;

    public static TagResponseDto of(Tag tag) {
        return TagResponseDto.builder()
                .imageURL(tag.getImageURL())
                .name(tag.getName())
                .id(tag.getId())
                .tagType(TagTypeResponseDto.of(tag.getTagType()))
                .build();
    }
}
