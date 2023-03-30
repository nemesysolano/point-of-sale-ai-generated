package com.warehouse.model

import javax.persistence.*

@Entity
@Table(name = "PRODUCTS")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    val id: Long = 0,

    @Column(name = "PRODUCT_NAME", nullable = false)
    val name: String
)