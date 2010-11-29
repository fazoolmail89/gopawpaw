package com.gopawpaw.erp.hibernate.i;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * IspMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.i.IspMstr
 * @author MyEclipse Persistence Tools
 */

public class IspMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(IspMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(IspMstr transientInstance) {
		log.debug("saving IspMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IspMstr persistentInstance) {
		log.debug("deleting IspMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IspMstr findById(com.gopawpaw.erp.hibernate.i.IspMstrId id) {
		log.debug("getting IspMstr instance with id: " + id);
		try {
			IspMstr instance = (IspMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.i.IspMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IspMstr instance) {
		log.debug("finding IspMstr instance by example");
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
		log.debug("finding IspMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IspMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all IspMstr instances");
		try {
			String queryString = "from IspMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IspMstr merge(IspMstr detachedInstance) {
		log.debug("merging IspMstr instance");
		try {
			IspMstr result = (IspMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IspMstr instance) {
		log.debug("attaching dirty IspMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IspMstr instance) {
		log.debug("attaching clean IspMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IspMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IspMstrDAO) ctx.getBean("IspMstrDAO");
	}
}