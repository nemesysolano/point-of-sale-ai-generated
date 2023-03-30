package com.warehouse.model

import javax.persistence.*

@Entity
@Table(name = "PURCHASE_ORDER_ITEM")
data class PurchaseOrderItem(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PURCHASE_ORDER_ITEM_ID")
    val purchaseOrderItemId: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INVENTORY_REQUISITION_ITEM_ID", referencedColumnName = "INVENTORY_REQUISITION_ITEM_ID", unique = true)
    val inventoryRequisitionItem: InventoryRequisitionItem,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PURCHASE_ORDER_ID", referencedColumnName = "PURCHASE_ORDER_ID")
    val purchaseOrder: PurchaseOrder,

    @Column(name = "QUANTITY")
    val quantity: Int
)