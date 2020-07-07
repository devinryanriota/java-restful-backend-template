package com.devin.feature.domain;

import java.time.LocalDate;

public class User {
  private String email;
  private UserType type;
  private String fullName;
  private String phoneNumber;
  private LocalDate dateOfBirth;
  private UserGender gender;

  public User() {
  }

  public User(String email, UserType type, String fullName, String phoneNumber,
      LocalDate dateOfBirth, UserGender gender) {
    this.email = email;
    this.type = type;
    this.fullName = fullName;
    this.phoneNumber = phoneNumber;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
  }

  public String getEmail() {
    return email;
  }

  public User setEmail(String email) {
    this.email = email;
    return this;
  }

  public UserType getType() {
    return type;
  }

  public User setType(UserType type) {
    this.type = type;
    return this;
  }

  public String getFullName() {
    return fullName;
  }

  public User setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public User setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public User setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  public UserGender getGender() {
    return gender;
  }

  public User setGender(UserGender gender) {
    this.gender = gender;
    return this;
  }
}
