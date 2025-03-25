const {chromium} = require('playwright')

getWebtoon()
async function getWebtoon(){
    const browser = await chromium.launch({
        headless: false
    });
    const ctx = await browser.newContext()
    const page = await ctx.newPage()
    await page.goto("https://comic.naver.com/index")

    // input에 글쓰기
    // await page.fill('css', 'admin')

    // click 이벤트 주기
    // await page.click('css')

    await page.waitForSelector('#container')
    const ul = await page.$('#container ul')
    if (ul) {
        const innerHTML = await ul.innerHTML();
        console.log(innerHTML);
      } else {
        console.error("ul element not found.");
      }

    page.screenshot({ path: 'a.png', full_page: true });
    browser.close()
}

