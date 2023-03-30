package com.warehouse.model

import javax.persistence.*

@Entity
@Table(name = "INVENTORY_REQUISITION_ITEM")
data class InventoryRequisitionItem(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INVENTORY_REQUISITION_ITEM_ID")
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INVENTORY_REQUISITION_ID")
    val inventoryRequisition: InventoryRequisition,

    @Column(name = "REQUESTED_QUANTITY", nullable = false)
    val requestedQuantity: Int,

    @Column(name = "APPROVED_QUANTITY", nullable = false)
    val approvedQuantity: Int
)