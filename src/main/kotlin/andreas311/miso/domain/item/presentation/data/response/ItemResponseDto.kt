package andreas311.miso.domain.item.presentation.data.response

import andreas311.miso.domain.item.entity.Item
import andreas311.miso.domain.purchase.entity.Purchase

data class ItemResponseDto(
    val id: Long,
    val price: Int,
    val name: String,
    val imageUrl: String
) {
    constructor(item: Item) : this(
        id = item.id,
        price = item.price,
        name = item.name,
        imageUrl = item.imageUrl
    )

    constructor(purchase: Purchase) : this(
        id = purchase.item.id,
        price = purchase.item.price,
        name = purchase.item.name,
        imageUrl = purchase.item.imageUrl
    )
}
