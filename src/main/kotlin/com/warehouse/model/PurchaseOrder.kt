package com.warehouse.model

import javax.persistence.*
@Entity
@Table(name = "PURCHASE_ORDER")
data class PurchaseOrder(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PURCHASE_ORDER_ID")
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUPPLIER_ID")
    val supplier: Supplier,

    @Column(name = "PURCHASE_ORDER_DATE", nullable = false)
    val purchaseOrderDate: java.sql.Timestamp
)
