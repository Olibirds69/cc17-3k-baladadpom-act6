package com.example.a30days

import TipAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.a30days.R
import com.example.a30days.model.TipItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Start of RecycleView
        // This finds the RecyclerView in the layout (activity_main.xml) using its ID
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        // Set the layout manager for the RecyclerView to LinearLayoutManager
        // LinearLayoutManager arranges the items in a vertical list (like a standard list)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create a list of TipItems that represents the data for the RecyclerView
        // TipItems are categorized into sections (headers) and actual tips, each with a day, title, description, and image.
        val tipItems = listOf(
            /*Section Header for Stock Market Tips*/
            TipItem.SectionHeader("Stock Market Tips"),
            // Stock Market
            TipItem.Tip(
                day = "Day 1",
                title = "Invest in Blue Chip Stocks",
                description = "Blue chip stocks provide steady growth over time due to their reliability.",
                imageResId = R.drawable.stock1
            ),
            TipItem.Tip(
                day = "Day 2",
                title = "Diversify Your Portfolio",
                description = "To manage risk, it's important not to concentrate all your investment in a single stock.",
                imageResId = R.drawable.stock2
            ),
            TipItem.Tip(
                day = "Day 3",
                title = "Reinvest Dividends",
                description = "Reinvesting dividends can significantly increase your investment returns over time.",
                imageResId = R.drawable.stock3
            ),
            TipItem.Tip(
                day = "Day 4",
                title = "Track Stock Performance",
                description = "Monitoring your stock’s performance helps you stay updated with market trends and movements.",
                imageResId = R.drawable.stock4
            ),
            TipItem.Tip(
                day = "Day 5",
                title = "Be Patient",
                description = "Investing in the stock market requires patience to allow investments to grow over time.",
                imageResId = R.drawable.stock5
            ),
            TipItem.Tip(
                day = "Day 6",
                title = "Buy in Market Dips",
                description = "Buying during market dips can help you purchase stocks at a lower price for greater potential gains.",
                imageResId = R.drawable.stock6
            ),

            /*Section Header for Crypto Insights*/
            TipItem.SectionHeader("Crypto Insights"),
            // Crypto Insights
            TipItem.Tip(
                day = "Day 7",
                title = "Buy During Dips",
                description = "Similar to stocks, buying cryptocurrency during dips provides opportunities for long-term growth.",
                imageResId = R.drawable.stock6
            ),
            TipItem.Tip(
                day = "Day 8",
                title = "Use Secure Wallets",
                description = "Ensure the security of your cryptocurrencies by using reputable and secure wallets.",
                imageResId = R.drawable.crypto2
            ),
            TipItem.Tip(
                day = "Day 9",
                title = "Stay Updated on Regulation",
                description = "As cryptocurrency regulations evolve, staying updated is important for compliance and understanding market impact.",
                imageResId = R.drawable.crypto3
            ),
            TipItem.Tip(
                day = "Day 10",
                title = "Diversify in Crypto",
                description = "Just like in the stock market, diversifying across multiple cryptocurrencies can mitigate risk.",
                imageResId = R.drawable.crypto4
            ),
            TipItem.Tip(
                day = "Day 11",
                title = "Understand Volatility",
                description = "Cryptocurrencies are highly volatile, so expect significant price fluctuations.",
                imageResId = R.drawable.crypto5
            ),
            TipItem.Tip(
                day = "Day 12",
                title = "Use Cold Storage for Security",
                description = "For long-term holdings, store cryptocurrencies offline in cold storage to prevent hacking risks.",
                imageResId = R.drawable.crypto6
            ),

            /*Section Header for Forex Strategies*/
            TipItem.SectionHeader("Forex Strategies"),
            // Forex Strategies
            TipItem.Tip(
                day = "Day 13",
                title = "Use Leverage Wisely",
                description = "Leverage can magnify both your gains and losses, so use it with caution.",
                imageResId = R.drawable.forex1
            ),
            TipItem.Tip(
                day = "Day 14",
                title = "Learn Risk Management",
                description = "Having a risk management plan helps minimize losses in the volatile forex market.",
                imageResId = R.drawable.forex2
            ),
            TipItem.Tip(
                day = "Day 15",
                title = "Study Forex Patterns",
                description = "Technical analysis and understanding forex patterns can help you make more informed trades.",
                imageResId = R.drawable.forex3
            ),
            TipItem.Tip(
                day = "Day 16",
                title = "Stay Updated on Global Events",
                description = "Global events like elections, wars, or natural disasters often impact currency values in the forex market.",
                imageResId = R.drawable.forex4
            ),
            TipItem.Tip(
                day = "Day 17",
                title = "Use Stop-Loss Orders",
                description = "Stop-loss orders help you minimize potential losses by automatically selling a currency when it hits a certain price.",
                imageResId = R.drawable.forex5
            ),
            TipItem.Tip(
                day = "Day 18",
                title = "Avoid Overtrading",
                description = "Overtrading can lead to impulsive decisions and losses. Stick to a strategy and avoid frequent trades.",
                imageResId = R.drawable.forex6
            ),

            /* Section Header for Business Ideas*/
            TipItem.SectionHeader("Business Ideas"),
            // Business Ideas
            TipItem.Tip(
                day = "Day 19",
                title = "E-commerce Store",
                description = "Starting an e-commerce store allows you to sell products online with relatively low initial investment.",
                imageResId = R.drawable.business1
            ),
            TipItem.Tip(
                day = "Day 20",
                title = "Subscription Box Service",
                description = "Offering a curated subscription box is a popular business model with recurring monthly revenue.",
                imageResId = R.drawable.business2
            ),
            TipItem.Tip(
                day = "Day 21",
                title = "Digital Marketing Agency",
                description = "Starting a digital marketing agency allows you to help businesses grow their online presence.",
                imageResId = R.drawable.business3
            ),
            TipItem.Tip(
                day = "Day 22",
                title = "Food Delivery Service",
                description = "Offering a food delivery service provides convenience and can cater to people looking for quick, healthy meals.",
                imageResId = R.drawable.business4
            ),
            TipItem.Tip(
                day = "Day 23",
                title = "Create a SaaS Product",
                description = "Building a Software as a Service (SaaS) product can create recurring revenue through subscription-based models.",
                imageResId = R.drawable.business5
            ),
            TipItem.Tip(
                day = "Day 24",
                title = "Freelance Consulting",
                description = "Leverage your expertise to help businesses grow through freelance consulting.",
                imageResId = R.drawable.business6
            ),

            /*Section Header fo rthe Rich Money Habits */
            TipItem.SectionHeader("Rich Money Habits"),
            // Rich Money Habits
            TipItem.Tip(
                "Day 25",
                "Save Before Spending",
                "Pay yourself first.",
                R.drawable.rich1
            ),
            TipItem.Tip(
                "Day 26",
                "Live Below Your Means",
                "Wealth is about how much you save, not how much you spend.",
                R.drawable.rich2
            ),
            TipItem.Tip(
                "Day 27",
                "Invest Consistently",
                "Make a habit of regular investing.",
                R.drawable.rich3
            ),
            TipItem.Tip(
                "Day 28",
                "Educate Yourself on Finance",
                "Continuous learning builds wealth.",
                R.drawable.rich4
            ), TipItem.Tip(
                "Day 29",
                "Avoid Debt",
                "Avoid debt, unless it's good debt.",
                R.drawable.rich5
            ),
            TipItem.Tip(
                "Day 30",
                "Track Your Net Worth",
                "Track your progress to stay motivated.",
                R.drawable.rich6
            )
        )

        // Create an instance of TipAdapter and set it on the RecyclerView
        // This adapter binds the tipItems list to the RecyclerView to display them as a scrollable list
        recyclerView.adapter = TipAdapter(tipItems)

        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
    }
}
