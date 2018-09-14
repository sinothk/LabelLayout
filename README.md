# 功能

## 流式布局
	自动换行
	行数自定：单行/多行
	支持单选/多选
	支持行居中/靠左显示
	支持添加/删除子View
	支持子View点击/长按事件

## 网格布局
	行数/列数自定
	支持单选/多选
	支持添加/删除子View
	支持子View点击/长按事件
	支持添加多样式分割线及横竖间隔

# 引入
## Step 1. Add the JitPack repository to your build file
	
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

## Step 2. Add the dependency
	dependencies {
		implementation 'com.github.sinothk:LabelView:1.0.0914'
	}

# 使用
## xml
    <com.sinothk.widget.labelView.style1.AutoFlowLayout
    android:id="@+id/afl_cotent"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
    
## JAVA

	private String[] mData = {"Java", "C++", "Python", "JavaScript", "Ruby", "Swift", "MATLAB", "Scratch", "Drat"};
	mFlowLayout = findViewById(R.id.afl_cotent);

	mFlowLayout.setAdapter(new FlowAdapter(Arrays.asList(mData)) {
	    @Override
	    public View getView(final int position) {
		View item = mLayoutInflater.inflate(R.layout.special_item, null);

		TextView tvAttrTag = (TextView) item.findViewById(R.id.tv_attr_tag);
		tvAttrTag.setText(mData[position]);

		return item;
	    }
	});

	mFlowLayout.setOnItemClickListener(new AutoFlowLayout.OnItemClickListener() {
	    @Override
	    public void onItemClick(int position, View view) {
		Toast.makeText(SpecialFlowActivity.this, mData[position], Toast.LENGTH_SHORT).show();
	    }
	});

	mFlowLayout.setOnLongItemClickListener(new AutoFlowLayout.OnLongItemClickListener() {
	    @Override
	    public void onLongItemClick(final int position, View view) {
		ImageView iv_delete = view.findViewById(R.id.iv_delete);
		iv_delete.setVisibility(View.VISIBLE);
		iv_delete.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View v) {
			Toast.makeText(SpecialFlowActivity.this, "position： " + position, Toast.LENGTH_SHORT).show();
		    }
		});
	    }
	});
  
## 参考 
   https://github.com/LRH1993/AutoFlowLayout
