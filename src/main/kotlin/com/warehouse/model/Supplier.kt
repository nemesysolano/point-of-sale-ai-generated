package com.warehouse.model

import javax.persistence.*


@Entity
@Table(name = "SUPPLIERS")
data class Supplier(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SUPPLIER_ID")
    val id: Long = 0,

    @Column(name = "SUPPLIER_NAME", nullable = false)
    val name: String
)