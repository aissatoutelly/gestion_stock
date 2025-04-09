//package com.example.gestion.models;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//import java.util.Set;
//
//@Entity
//@Data
//@Table(name = "Users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String name;
//
////    @OneToOne
////    @JoinColumn(name="idprofil")
////    private Profil profil;
//
//
//    @OneToOne
//    @JoinColumn(name = "idprofil")
//    private Profil profil;
//
//
//
//
//
//
//
//
////    @OneToMany(mappedBy="user")
////    private List<Post> post;
//
//
////   @OneToMany(mappedBy = "user")
////   private List<Post> post;
//
//
//
////@OneToMany(mappedBy = "user")
////private List<Post> posts;
//
//
//
//
//
//
//
//
//
//
//
//
//
////    @ManyToMany
////    @JoinTable(
////            name ="user_group",
////            joinColumns = @JoinColumn(name="iduser"),
////           inverseJoinColumns = @JoinColumn(name ="idgroup"))
////            private Set<UserGroup> groups
//
//
////@ManyToMany
////        @JoinTable(
////        name ="user_group",
////        joinColumns = @JoinColumn(name="iduser"),
////      inverseJoinColumns = @JoinColumn(name ="idgroup"))
////        private Set<UserGroup> groups;
//
//
//   @ManyToMany
//    @JoinTable(
//            name="user_group",
//            joinColumns = @JoinColumn(name = "iduser"),
//            inverseJoinColumns = @JoinColumn(name = "idgroup"))
//            private Set<UserGroup> groups;
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
