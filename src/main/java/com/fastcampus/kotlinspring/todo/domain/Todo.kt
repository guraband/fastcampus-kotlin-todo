package com.fastcampus.kotlinspring.todo.domain

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "todos")
class Todo(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = 0,

    @Column
    var title: String,

    @Column
    var description: String,

    @Column
    var done: Boolean,

    @Column(name = "created_at")
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    var updatedAt: LocalDateTime? = null,
) {
    fun update(title: String, description: String, done: Boolean) {
        this.title = title
        this.description = description
        this.done = done
        this.updatedAt = LocalDateTime.now()
    }
}