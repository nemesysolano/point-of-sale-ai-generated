package com.warehouse.model

import javax.persistence.*

@Entity
@Table(name = "WAREHOUSES")
data class Warehouse(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WAREHOUSE_ID")
    val id: Long = 0,

    @Column(name = "WAREHOUSE_NAME", nullable = false)
    val name: String
)