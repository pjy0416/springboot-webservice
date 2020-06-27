package com.zin0.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {   // JpaRepository<Entity 클래스, PK 타입> 상속 ~> CRUD 자동 생성
}
