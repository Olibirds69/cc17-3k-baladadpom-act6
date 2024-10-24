package com.example.a30days.model

sealed class TipItem {
    // Data class for a Section Header (e.g., "Stock Market Tips", "Crypto Insights")
    data class SectionHeader(val title: String) : TipItem()

    // Data class for individual Tips (e.g., "Invest in Blue Chip Stocks")
    data class Tip(
        val day: String,       // e.g., "Day 1"
        val title: String,     // e.g., "Invest in Blue Chip Stocks"
        val description: String, // e.g., "Blue chip stocks provide steady growth."
        val imageResId: Int    // Resource ID for the image, e.g., R.drawable.stock_image1
    ) : TipItem()
}
