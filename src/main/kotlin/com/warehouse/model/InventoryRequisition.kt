package com.warehouse.model

import javax.persistence.*


@Entity
@Table(name = "INVENTORY_REQUISITION")
data class InventoryRequisition(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVENTORY_REQUISITION_ID")
    val id: Long = 0,

    @Column(name = "REQUISITION_DATE", nullable = false)
    val requisitionDate: java.sql.Timestamp,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WAREHOUSE_ID")
    val warehouse: Warehouse
)
