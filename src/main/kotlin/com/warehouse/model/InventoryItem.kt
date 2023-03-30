package com.warehouse.model

import javax.persistence.*

@Entity
@Table(name = "INVENTORY_ITEMS")
data class InventoryItem(
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WAREHOUSE_ID")
    val warehouse: Warehouse,

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    val product: Product,

    @Id
    @Column(name = "SHELF_NUMBER")
    val shelfNumber: Int,

    @Id
    @Column(name = "RACK_NUMBER")
    val rackNumber: Int,

    @Column(name = "ON_HAND_QUANTITY", nullable = false)
    val onHandQuantity: Int,

    @Column(name = "MINIMUM_QUANTITY", nullable = false)
    val minimumQuantity: Int
)