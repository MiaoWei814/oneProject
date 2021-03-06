package org.learn.service.impl;

import org.learn.domain.TNavigationBar;
import org.learn.domain.vo.IndexNavigationListSideVo;
import org.learn.domain.vo.IndexNavigationListVo;
import org.learn.mapper.TNavigationBarMapper;
import org.learn.service.ITNavigationBarService;
import org.learn.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.learn.util.Constant.NAX_INDEX_NAVIGATION;

@Service
public class TNavigationBarServiceImpl implements ITNavigationBarService {
    @Autowired
    private TNavigationBarMapper tNavigationBarMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TNavigationBar selectTNavigationBarById(Long id) {
        return tNavigationBarMapper.selectTNavigationBarById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param tNavigationBar 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TNavigationBar> selectTNavigationBarList(TNavigationBar tNavigationBar) {
        return tNavigationBarMapper.selectTNavigationBarList(tNavigationBar);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param tNavigationBar 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTNavigationBar(TNavigationBar tNavigationBar) {
        return tNavigationBarMapper.insertTNavigationBar(tNavigationBar);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param tNavigationBar 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTNavigationBar(TNavigationBar tNavigationBar) {
        return tNavigationBarMapper.updateTNavigationBar(tNavigationBar);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTNavigationBarByIds(Long[] ids) {
        return tNavigationBarMapper.deleteTNavigationBarByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTNavigationBarById(Long id) {
        return tNavigationBarMapper.deleteTNavigationBarById(id);
    }

    /**
     * 导航列表
     *
     * @return {@link AjaxResult}
     */
    @Override
    public AjaxResult navigationList() {
        List<String> navigationName = tNavigationBarMapper.selectTopNavigationList(1, NAX_INDEX_NAVIGATION);
        List<IndexNavigationListSideVo> navigationListSideVos = tNavigationBarMapper.selectSideNavigationList(2, NAX_INDEX_NAVIGATION);
        IndexNavigationListVo vo = new IndexNavigationListVo().setTopNavigation(navigationName).setSidebar(navigationListSideVos);
        return AjaxResult.success(vo);
    }
}