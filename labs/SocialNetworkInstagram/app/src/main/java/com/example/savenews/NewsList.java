package com.example.savenews;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NewsList extends Fragment {

    RecyclerView recyclerView;
    private Adapter adapter;
    private Adapter.ItemClickListener listener;
    private Adapter.FragmentButtonListener fragmentButtonListener = null;
    private Adapter.FragmentLikeListener fragmentLikeListener = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater
                .inflate(R.layout.page, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        listener = new Adapter.ItemClickListener() {
            @Override
            public void ItemClick(int position, News item) {
                Intent intent = new Intent(getActivity(), NewsDetailActivity.class);
                intent.putExtra("news", item);
                startActivity(intent);
            }
        };
        fragmentButtonListener = new Adapter.FragmentButtonListener() {
            @Override
            public void myClick(News news, int option) {
                ((MainActivity) getActivity()).myClick(news, option);
            }
        };
        fragmentLikeListener = new Adapter.FragmentLikeListener() {
            @Override
            public void removeItemLike(News news) {
                ((MainActivity)getActivity()).removeItemLike(news);
            }
        };
        adapter = new Adapter(newsGenerator(), listener, fragmentButtonListener, fragmentLikeListener);
        recyclerView.setAdapter(adapter);
        return rootView;
    }

    private List<News> newsGenerator(){
        List<News> items = new ArrayList<>();
        News news1 = new News(
                1,
                "aigerimbekbolatkyzyy",
                "October 13, 2019",
                R.drawable.profile1,
                594,
                R.drawable.post1,
                "Hello! I like beautiful dresses\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D"

        );
        items.add(news1);
        News news2 = new News(
                2,
                "Girls'shop",
                "December 3, 2019",
                R.drawable.profile2,
                5402,
                R.drawable.post2,
                "Blazer ♥"
        );
        items.add(news2);
        News news3 = new News(
                3,
                "getteggroup",
                "May 15, 2019",
                R.drawable.profile3,
                21010,
                R.drawable.post3,
                "Хочу \uD83E\uDD24"
        );
        items.add(news3);
        News news4 = new News (
                4,
                "tiffany801.gg",
                "May 31, 2018",
                R.drawable.profile4,
                1396,
                R.drawable.post4,
                "She never made us disappointed in the style of her fashion \uD83C\uDF20❤ @tiffanyyoungofficial .\n" +
                        "I miss you , miss you like crazy , miss you Tiffany ❤ ❤ \uD83D\uDC95 @tiffanyyoungofficial . ❤ ❤ ❤ ❤ ❤ ❤❤❤❤❤❤❤❤❤❤❤ @tiffanyyoungofficial @tiffanyyoungofficial @tiffanyyoungofficial @tiffanyyoungofficial @tiffanyyoungofficial @tiffanyyoungofficial @tiffanyyoungofficial @tiffanyyoungofficial @tiffanyyoungofficial @tiffanyyoungofficial @tiffanyyoungofficial @tiffanyyoungofficial ❤❤❤❤❤❤❤❤❤❤❤❤❤ ❤ ❤ ❤ ❤ ❤\n" +
                        "_____________________\n" +
                        "#Tiffany #Miyoung #Sephanie #HwangMiYoung #StephanieHwang #TiffanyHwang #TiffanyYoung #GirlsGeneration #GG #SNSD #SoShi #Ot9 #S9 #Sone #Fanytastic #kpop #like4like #kpop #for4for #tiffany801.gg"
        );
        items.add(news4);
        News news5 = new News (
                5,
                "randomemss",
                "April 29, 2019",
                R.drawable.profile5,
                11763,
                R.drawable.post5,
                "Как говорится, чёрный юмор как еда... #мем #меми #мемы #шутка #шутки #шутеечка #шутказа300 #юмор #гумор #ржачь #ржака #шуткаминутка #смешное #смех #жарти #мемы2019 #шуткадня #смешно #угар #смешнодослез #угар #мемыукраина #мемчики #мемасики #поржать"
        );
        items.add(news5);
        News news6 = new News (
                6,
                "tiffanyyoungofficial",
                "March 27, 2019",
                R.drawable.profile6,
                392352,
                R.drawable.post6,
                "Wantttt"
        );
        items.add(news6);
        News news7 = new News (
                7,
                "taylorswift",
                "March 15, 2019",
                R.drawable.profile7,
                1596668,
                R.drawable.post7,
                "\uD83E\uDD8B \uD83D\uDC97 \uD83D\uDCF8 @presleyannphoto"
        );
        items.add(news7);
        News news8 = new News(
                8,
                "shinebright",
                "November 20, 2018",
                R.drawable.profile8,
                181,
                R.drawable.post8,
                "Shine bright like a diamond\uD83D\uDC8E\uD83D\uDC8E\uD83D\uDC8E"
        );
        items.add(news8);
        News news9 = new News (
                9,
                "mems__group",
                "January 3",
                R.drawable.profile9,
                8474,
                R.drawable.post9,
                "\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02"
        );
        items.add(news9);
        News news10 = new News (
                10,
                "mems",
                "January 6",
                R.drawable.profile10,
                10716,
                R.drawable.post10,
                "I sleep like a baby (yoda) \uD83D\uDE34 \uD83D\uDCA4 \uD83D\uDECF .\n" +
                        ".\n" +
                        "Follow @baby.yoda.memes__ for more! \uD83D\uDC9A\n" +
                        ".\n" +
                        ".\n" +
                        "#yoda #yodamemes #babyyoda #babyyodamemes #starwars #themandalorian #mando " +
                        "#mandalorian #disney #disneyplus #cute #repost #riseofskywalker #lucasfilm " +
                        "#adorable #funny #memes #prequelmemes #jedi #force #theforce #new " +
                        "#rebelforceradio #relatable #relevant #starwarsclonewars #DaveFiloni " +
                        "#thisIsTheWay TheChild"
        );
        items.add(news10);
        News news11 = new News(
                11,
                "humortechrocks",
                "March 6",
                R.drawable.profile11,
                18857,
                R.drawable.post11,
                "\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23");
        items.add(news11);
        News news12 = new News(
                12,
                "polymathematica",
                "February 20",
                R.drawable.profile12,
                25809,
                R.drawable.post12,
                "Best example ever \uD83D\uDE00\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        ".\n" +
                        "\n" +
                        "#Repost @jee.memes @scaleemael\n" +
                        "• • • • • •\n" +
                        "\n" +
                        "#mathisfun #engineeringstudent #computerscience #math #physics #checkmate #engineeringmemes #mathmemes #computer #maths  #mathmeme #matematica #geometry #mathmeme #estudos #mathstudents  #study  #estudante #engenharia #blackhole #scientist  #scienceisfun #matematicas #engineering #nerd #calculus  #geometry #mathjokes"
        );
        items.add(news12);
        News news13 = new News(
                13,
                "e.l.c.u.c.u.y",
                "January 12",
                R.drawable.profile13,
                6792,
                R.drawable.post13,
                "\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02"
        );
        items.add(news13);
        News news14 = new News(
                14,
                "astrologpress",
                "January 12",
                R.drawable.profile14,
                7300,
                R.drawable.post14,
                "РУБРИКА - ASTROГРАФИКА. Поддержите нас лайком ❤️, чтобы мы не потеряли друг друга.\n" +
                        "⠀\n" +
                        "А какой Ваш любимый камень?\n" +
                        "⠀\n" +
                        "С радостью увидим нашу ASTROГРАФИКУ в Ваших Сторис \uD83D\uDCF2 - и не забудьте отметить @astrologpress \uD83D\uDE09\n" +
                        "\n" +
                        "original by @sanctuarywrld "
        );
        items.add(news14);
        News news15 = new News(
                15,
                "9gag",
                "January 8",
                R.drawable.profile15,
                944583,
                R.drawable.post15,
                "\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23"
        );
        items.add(news15);
        News news16 = new News(
                16,
                "hackersha",
                "December 3, 2019",
                R.drawable.profile16,
                3016,
                R.drawable.post16,
                "#mems#instagram#joke#likes#repost"
        );
        items.add(news16);
        News news17 = new News(
                17,
                "comely.vintage",
                "December 9, 2019",
                R.drawable.profile17,
                9393,
                R.drawable.post17,
                "\uD835\uDC3C\uD835\uDCC3\uD835\uDCC8\uD835\uDCC5\uD835\uDCBE\uD835\uDCC7\uD835\uDCB6\uD835\uDCC9\uD835\uDCBE\uD835\uDC5C\uD835\uDCC3\n" +
                        "#comelyvintage\n" +
                        "~ via: @samsonthedood"
        );
        items.add(news17);
        News news18 = new News(
                18,
                "edsm_kdrama",
                "June 7, 2019",
                R.drawable.profile18,
                2260,
                R.drawable.post18,
                "Yang tadinya benci banget ama laki yang ngerokok\n" +
                        "Tapi kalo om akuh buat pengecualian kok\uD83D\uDE0B\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\n" +
                        "Keliatan Laki banget Om\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D\n" +
                        "CR : andylah tumblr account\n" +
                        "#그녀의사생활 #HerPrivateLife #TVNDrama\n" +
                        "#박민영 #parkminyoung #SungDukMi\n" +
                        "#김재욱 #KimJaeWook #RyanGold\n" +
                        "#정제원 #JungJaeWon #ChaShiAhn\n" +
                        "#안보현 #AhnBoHyun #NamEunKi\n" +
                        "#김보라 #KimBoRa #Cindy\n" +
                        "#Wednesday #Thursday\n" +
                        "#누나팬닷컴"
        );
        items.add(news18);
        News news19 = new News(
                19,
                "lildickygram",
                "April 19, 2019",
                R.drawable.profile19,
                3003426,
                R.drawable.post19,
                "\uD83C\uDF0D out now #WeLoveTheEarth"
        );
        items.add(news19);
        News news20 = new News(
                20,
                "artjumbo",
                "December 23, 2018",
                R.drawable.profile20,
                5734,
                R.drawable.post20,
                "Toothless celebrities\n" +
                        "Tag a friend and say nothing \uD83D\uDC47\n" +
                        "\n" +
                        "Follow @artjumbo @artjumbo \u200D\uD83C\uDFA8"
        );
        items.add(news20);
        return items;
    }

    public void removeLike(News news){
        adapter.removeLike(news);
    }
}
