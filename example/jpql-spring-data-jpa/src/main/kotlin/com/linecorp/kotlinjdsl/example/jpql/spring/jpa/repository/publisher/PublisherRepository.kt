package com.linecorp.kotlinjdsl.example.jpql.spring.jpa.repository.publisher

import com.linecorp.kotlinjdsl.example.jpql.spring.jpa.entity.publisher.Publisher
import com.linecorp.kotlinjdsl.support.spring.data.jpa.repository.KotlinJdslJpqlExecutor
import org.springframework.data.jpa.repository.JpaRepository

interface PublisherRepository : JpaRepository<Publisher, Long>, KotlinJdslJpqlExecutor
