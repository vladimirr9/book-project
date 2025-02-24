/*
 * The book project lets a user keep track of different books they would like to read, are currently
 * reading, have read or did not finish.
 * Copyright (C) 2021  Karan Kumar
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package com.karankumar.bookproject.dto;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.karankumar.bookproject.model.Author;
import lombok.Data;

@Data
public class BookPatchDto {
    @JsonProperty("title")
    private String title;

    @JsonProperty("numberOfPages")
    private Integer numberOfPages;

    @JsonProperty("pagesRead")
    private Integer pagesRead;

    @JsonProperty("bookGenres")
    private Set<String> bookGenres;

    @JsonProperty("bookFormat")
    private String bookFormat;

    @JsonProperty("seriesPosition")
    private Integer seriesPosition;

    @JsonProperty("edition")
    private Integer edition;

    @JsonProperty("bookRecommendedBy")
    private String bookRecommendedBy;

    @JsonProperty("isbn")
    private String isbn;

    @JsonProperty("yearofPublication")
    private Integer yearOfPublication;

    @JsonProperty("author")
    private Author author;

    @JsonProperty("predefinedShelf")
    private String predefinedShelf;

    @JsonProperty("bookReview")
    private String bookReview;
}
