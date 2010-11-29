package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SlrdDet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SlrdDet
 * @author MyEclipse Persistence Tools
 */

public class SlrdDetDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SlrdDetDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SlrdDet transientInstance) {
		log.debug("saving SlrdDet instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SlrdDet persistentInstance) {
		log.debug("deleting SlrdDet instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SlrdDet findById(com.gopawpaw.erp.hibernate.s.SlrdDetId id) {
		log.debug("getting SlrdDet instance with id: " + id);
		try {
			SlrdDet instance = (SlrdDet) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SlrdDet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SlrdDet instance) {
		log.debug("finding SlrdDet instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding SlrdDet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SlrdDet as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SlrdDet instances");
		try {
			String queryString = "from SlrdDet";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SlrdDet merge(SlrdDet detachedInstance) {
		log.debug("merging SlrdDet instance");
		try {
			SlrdDet result = (SlrdDet) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SlrdDet instance) {
		log.debug("attaching dirty SlrdDet instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SlrdDet instance) {
		log.debug("attaching clean SlrdDet instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SlrdDetDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SlrdDetDAO) ctx.getBean("SlrdDetDAO");
	}
}