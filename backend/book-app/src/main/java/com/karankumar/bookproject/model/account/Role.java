/*
   The book project lets a user keep track of different books they would like to read, are currently
   reading, have read or did not finish.
   Copyright (C) 2020  Karan Kumar

   This program is free software: you can redistribute it and/or modify it under the terms of the
   GNU General Public License as published by the Free Software Foundation, either version 3 of the
   License, or (at your option) any later version.

   This program is distributed in the hope that it will be useful, but WITHOUT ANY
   WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
   PURPOSE.  See the GNU General Public License for more details.

   You should have received a copy of the GNU General Public License along with this program.
   If not, see <https://www.gnu.org/licenses/>.
*/

package com.karankumar.bookproject.model.account;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Setter(AccessLevel.NONE)
  private Long id;

  // TODO: use RoleType here instead
  @NotBlank private String role;

  public Role(@NonNull String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Role role1 = (Role) o;
    return role.equals(role1.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role);
  }
}
