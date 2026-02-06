const newsDiv = document.getElementById("news");
const searchBox = document.getElementById("search");

let articles = [];
let currentCategory = "all";
fetch("https://api.spaceflightnewsapi.net/v4/articles/?limit=15")
    .then(res => res.json())
    .then(data => {
        articles = data.results;
        showNews(articles);
    });
function showNews(list) {
    newsDiv.innerHTML = "";
    list.forEach(item => {
        const date = new Date(item.published_at).toDateString();

        newsDiv.innerHTML += `
            <div class="news-card">
                <img src="${item.image_url}">
                <div class="news-content">
                    <div class="news-date">${date}</div>
                    <div class="news-title">${item.title}</div>
                    <a href="${item.url}" target="_blank">Read more</a>
                </div>
            </div>
        `;
    });
}
searchBox.addEventListener("keyup", () => {
    applyFilters();
});
function filterCategory(category) {
    currentCategory = category;
    applyFilters();
}
function applyFilters() {
    let filtered = articles;
    if (currentCategory !== "all") {
        filtered = filtered.filter(a =>
            a.title.toLowerCase().includes(currentCategory.toLowerCase())
        );
    }
    const searchValue = searchBox.value.toLowerCase();
    filtered = filtered.filter(a =>
        a.title.toLowerCase().includes(searchValue)
    );
    showNews(filtered);
}